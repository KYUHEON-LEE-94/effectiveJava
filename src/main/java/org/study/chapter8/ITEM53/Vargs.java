package org.study.chapter8.ITEM53;

/**
 * packageName    : org.study.chapter8.ITEM53
 * fileName       : Vargs
 * author         : heon
 * date           : 2024-05-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-07           heon               최초 생성
 */
public class Vargs {

    static int sum(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static int sum2(int firstNumber, int... numbers) {
        int sum = firstNumber;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
