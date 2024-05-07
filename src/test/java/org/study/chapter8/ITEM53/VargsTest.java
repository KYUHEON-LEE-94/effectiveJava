package org.study.chapter8.ITEM53;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter8.ITEM53
 * fileName       : VargsTest
 * author         : heon
 * date           : 2024-05-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-07           heon               최초 생성
 */
class VargsTest {

    @Test
    @DisplayName("런타임에서 에러 발생")
    void sum1(){
        Vargs.sum(1, 2);
        Vargs.sum(1);
        Vargs.sum();
    }

    @Test
    @DisplayName("컴파일에서 에러 발생")
    void sum2(){
        Vargs.sum2(1, 2);
        Vargs.sum2(1);
        // Vargs.sum2();
    }
}