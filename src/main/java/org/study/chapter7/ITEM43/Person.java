package org.study.chapter7.ITEM43;

/**
 * packageName    : org.study.chapter7.ITEM43
 * fileName       : Person
 * author         : heon
 * date           : 2024-04-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-17           heon               최초 생성
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isLastNameKim(Person person) {
        return person.getName().startsWith("김");
    }
}
