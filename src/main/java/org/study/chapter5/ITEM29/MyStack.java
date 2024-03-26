package org.study.chapter5.ITEM29;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * packageName    : org.study.chapter5.ITEM29
 * fileName       : MyStack
 * author         : heon
 * date           : 2024-03-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-26           heon               최초 생성
 */
public class MyStack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public MyStack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if(size == 0) throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            //새로운 길이로 배열을 복사.
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push("1");

        stack.pop().getClass();
        stack.pop().getClass();
    }
}
