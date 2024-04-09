package org.study.chapter6.ITEM39;

/**
 * packageName    : org.study.chapter6.ITEM39
 * fileName       : Sample2
 * author         : heon
 * date           : 2024-04-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09           heon               최초 생성
 */
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 1 / 0;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] arr = new int[0];
        arr[1] = 1;     // outOfIndex 예외 발생
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {}
}
