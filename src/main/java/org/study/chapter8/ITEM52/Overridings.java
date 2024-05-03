package org.study.chapter8.ITEM52;

import java.util.List;

/**
 * packageName    : org.study.chapter8.ITEM52
 * fileName       : Overridings
 * author         : heon
 * date           : 2024-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-03           heon               최초 생성
 */
public class Overridings {
    public static void main(String[] args) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());

        for (Wine wine : wineList) {
            System.out.println(wine.name());
        }
    }
}
