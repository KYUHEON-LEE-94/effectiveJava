package org.study.chapter6.ITEM34;

import static org.study.chapter6.ITEM34.PayType.WEEKDAY;
import static org.study.chapter6.ITEM34.PayType.WEEKEND;

/**
 * packageName    : org.study.chapter6.ITEM34
 * fileName       : PayrollDay
 * author         : heon
 * date           : 2024-04-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03           heon               최초 생성
 */
public enum PayrollDay {
    MONDAY(WEEKDAY),
    TUESDAY(WEEKDAY),
    WEDNESDAY(WEEKDAY),
    THURSDAY(WEEKDAY),
    FRIDAY(WEEKDAY),
    SATURDAY(WEEKEND),
    SUNDAY(WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }
}
