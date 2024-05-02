package org.study.chapter7.ITEM46;

import lombok.Builder;

/**
 * packageName    : org.study.chapter7.ITEM46
 * fileName       : Person
 * author         : heon
 * date           : 2024-04-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-22           heon               최초 생성
 */
@Builder
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
