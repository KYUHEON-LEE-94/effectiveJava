package org.study.chatper2.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : org.study.chatper2.comparable
 * fileName       : ComparableExample
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public class ComparableExample {
    public static void main(String[] args) {
        Student[] student = getStudents();
        print(student);

        Arrays.sort(student);

        System.out.println("========================");
        System.out.println("========================");

        print(student);
    }

    private static Student[] getStudents() {
        Student[] student = new Student[5];

        student[0] = new Student("Dave", 20120001, 4.2);
        student[1] = new Student("Amie", 20150001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        return student;
    }

    private static void print(final Student[] students) {
        for (Student s : students) {
            System.out.println(s.toString());
        }

        Comparator<Student> comparator = Comparator.comparingDouble(student -> student.score);

        Arrays.sort(students, comparator);
    }
}
