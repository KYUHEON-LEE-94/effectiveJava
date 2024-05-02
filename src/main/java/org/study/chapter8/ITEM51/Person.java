package org.study.chapter8.ITEM51;

import lombok.Builder;

/**
 * packageName    : org.study.chapter8.ITEM51
 * fileName       : Person
 * author         : heon
 * date           : 2024-05-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02           heon               최초 생성
 */
@Builder
public class Person {
    private String name;
    private double height;
    private double weight;
    private boolean hair;
    private int age;
}
