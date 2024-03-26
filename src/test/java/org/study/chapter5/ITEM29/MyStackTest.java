package org.study.chapter5.ITEM29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter5.ITEM29
 * fileName       : MyStackTest
 * author         : heon
 * date           : 2024-03-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26           heon               최초 생성
 */
class MyStackTest {
    @Test
    public void StackTest() {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push("1");

        assertEquals(stack.pop().getClass(), String.class);
        assertEquals(stack.pop().getClass(), String.class); // Fail Test
    }
}