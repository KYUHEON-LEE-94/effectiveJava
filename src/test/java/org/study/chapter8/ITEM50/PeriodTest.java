package org.study.chapter8.ITEM50;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter8.ITEM50
 * fileName       : PeriodTest
 * author         : heon
 * date           : 2024-04-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30           heon               최초 생성
 */
class PeriodTest {

    @Test
    void breakFinal(){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78);
    }

    @Test
    void breakFinal2(){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        p.end().setYear(78);
    }
}