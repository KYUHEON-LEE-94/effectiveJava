package org.study.chapter5.ITEM31;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter5.ITEM31
 * fileName       : StackTestITEM31
 * author         : heon
 * date           : 2024-03-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28           heon               최초 생성
 */
class StackTestITEM31 {
    @Test
    void test(){
        Stack<Number> numberStack = new Stack<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        numberStack.pushAll(integers);
    }

    @Test
    @DisplayName("공변 테스트")
    void variance() {
        // given
        Stack<Number> numberStack = new Stack<>();

        // when
        List<Integer> integers = Arrays.asList(1, 2, 3);
        numberStack.pushAll(integers);

        // then
        assertEquals(numberStack.stackSize(), 3);
    }

    @Test
    void popAll(){
        Stack<Number> numberStack = new Stack<>();
        List<Object> dst = new ArrayList<>();
        numberStack.popAll(dst);
    }

    @Test
    @DisplayName("반공변 테스트")
    void contraVariance() {
        // given
        Stack<Number> numberStack = new Stack<>();
        List<Integer> integers = Arrays.asList(1, 2, 3);
        numberStack.pushAll(integers);

        // when
        List<Object> dst = new ArrayList<>();
        numberStack.popAll(dst);

        // then
        assertEquals(dst.size(), 3);
    }
}