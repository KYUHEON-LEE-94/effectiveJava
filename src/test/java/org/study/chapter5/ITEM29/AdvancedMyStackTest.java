package org.study.chapter5.ITEM29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter5.ITEM29
 * fileName       : AdvancedMyStackTest
 * author         : heon
 * date           : 2024-03-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26           heon               최초 생성
 */
class AdvancedMyStackTest {
    @Test
    public void StackTest() {
        AdvancedMyStack stack = new AdvancedMyStack<String>();

        stack.push("1");
        assertEquals(stack.pop().getClass(), String.class);
    }
}