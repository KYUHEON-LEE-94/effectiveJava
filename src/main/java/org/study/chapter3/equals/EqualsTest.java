package org.study.chapter3.equals;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : org.study.equals
 * fileName       : EqualsTest
 * author         : LEE KYUHEON
 * date           : 2024-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-02        LEE KYUHEON       최초 생성
 */
public class EqualsTest {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        Member member = new Member("email","name", 29);
        members.add(member);
        System.out.println("members = " + members.contains(member));
    }
}
