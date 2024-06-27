package org.study.chapter12.ITEM86;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * packageName    : org.study.chapter12.ITEM86
 * fileName       : Person
 * author         : LEE KYUHEON
 * date           : 2024-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-27        LEE KYUHEON       최초 생성
 */
@Getter
@Setter
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
