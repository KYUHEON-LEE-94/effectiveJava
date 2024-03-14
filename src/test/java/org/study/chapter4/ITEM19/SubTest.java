package org.study.chapter4.ITEM19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter4.ITEM19
 * fileName       : SubTest
 * author         : heon
 * date           : 2024-03-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-14           heon               최초 생성
 */
class SubTest {
    @Test
    void cloneTest() throws CloneNotSupportedException {
        Sub sub = new Sub();
        assertEquals(sub.type, "super");// it's true, pass
        Sub clone = sub.clone();
        assertEquals(sub.type, "sub");
    }

}