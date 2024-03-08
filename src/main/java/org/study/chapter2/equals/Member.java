package org.study.chapter2.equals;

/**
 * packageName    : org.study.equals
 * fileName       : Member
 * author         : LEE KYUHEON
 * date           : 2024-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-02        LEE KYUHEON       최초 생성
 */
public class Member {
    String email;
    String name;
    Integer age;

    public Member(String email, String name, Integer age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this == obj;
    }
}
