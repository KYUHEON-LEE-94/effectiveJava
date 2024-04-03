package org.study.chapter6.ITEM34;

/**
 * packageName    : org.study.chapter6.ITEM34
 * fileName       : PayType
 * author         : heon
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03           heon               최초 생성
 */
enum PayType {
    WEEKDAY {
        int overtimePay(int minutesWorked, int payRate) {
            return minutesWorked <= MINS_PER_SHIFT ? 0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
        }
    },

    WEEKEND {
        int overtimePay(int minutesWorked, int payRate) {
            return minutesWorked * payRate / 2;
        }
    };

    abstract int overtimePay(int minutesWorked, int payRate);

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
        int basePay = minutesWorked & payRate;
        return basePay + overtimePay(minutesWorked, payRate);
    }
}
