package org.study.chapter6.ITEM35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter6.ITEM35
 * fileName       : EnsembleTest
 * author         : heon
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04           heon               최초 생성
 */
class EnsembleTest {

    @Test
    void ensemble(){
        assertEquals(Ensemble.SOLO.numberOfMusicians(),1 );
    }
}