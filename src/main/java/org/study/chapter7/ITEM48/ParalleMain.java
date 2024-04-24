package org.study.chapter7.ITEM48;

import java.util.stream.IntStream;

/**
 * packageName    : org.study.chapter7.ITEM48
 * fileName       : ParalleMain
 * author         : heon
 * date           : 2024-04-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24           heon               최초 생성
 */
public class ParalleMain {
    public static void main(String[] args) {
        System.out.println("Normal...");

        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println();
        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);
    }
}
