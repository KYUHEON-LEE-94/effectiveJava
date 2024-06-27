package org.study.chapter12.ITEM86;

import java.io.Serializable;

/**
 * packageName    : org.study.chapter12.ITEM86
 * fileName       : Employee
 * author         : LEE KYUHEON
 * date           : 2024-06-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-27        LEE KYUHEON       최초 생성
 */
public class Employee implements Serializable {
    private final String company;
    private final String team;

    public Employee(String company, String team) {
        this.company = company;
        this.team = team;
    }
}
