package org.study.chapter12.ITEM85;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : heon
 * @Description : Member.java
 * @since : 2024-06-26
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-26       heon         최초 생성
 *
 * <pre>
 */
public class Member implements Serializable {

    private String name;
    private String email;
    private int age;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
    }

    static byte[] bomb() {
        Set<Object> root = new HashSet<>();
        Set<Object> s1 = root;
        Set<Object> s2 = new HashSet<>();
        for (int i = 0; i<100; i++) {
            Set<Object> t1 = new HashSet<>();
            Set<Object> t2 = new HashSet<>();
            t1.add("foo"); // t1을 t2와 다르게 만든다.
            s1.add(t1);
            s1.add(t2);
            s2.add(t1);
            s2.add(t2);
            s1 = t1;
            s2 = t2;
        }
        return serialize(root); // 간결하게 하기 위해 이 메서드의 코드는 생략함
    }

    public static void main(String[] args){
        Member member = new Member("홍길동", "hong@gmail.com", 25);
        byte[] serializedMember;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                serializedMember = baos.toByteArray();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Base64.getEncoder().encodeToString(serializedMember));
    }
}
