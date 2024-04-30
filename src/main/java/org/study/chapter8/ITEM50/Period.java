package org.study.chapter8.ITEM50;

import java.util.Date;

/**
 * packageName    : org.study.chapter8.ITEM50
 * fileName       : Period
 * author         : heon
 * date           : 2024-04-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30           heon               최초 생성
 */
public record Period(Date start, Date end) {
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        /*매개인자 검증*/
        if (this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException(this.start + "가 " + this.end + "보다 늦다.");
        }
    }

    @Override
    public Date start() {
        return new Date(start.getTime());
    }

    @Override
    public Date end() {
        return new Date(end.getTime());
    }
}
