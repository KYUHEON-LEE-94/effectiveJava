package org.study.chapter5.ITEM31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * packageName    : org.study.chapter5.ITEM31
 * fileName       : Stack
 * author         : heon
 * date           : 2024-03-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28           heon               최초 생성
 */
public class Stack <E>{
    private final List<E> stack = new ArrayList<>();
    private int position = -1;

    public void push(E element) {
        position += 1;
        stack.add(element);
    }

    public E pop() {
        E popElement = stack.remove(position);
        position -= 1;
        return popElement;
    }

    public boolean isEmpty() {
        return position == -1;
    }

    public int stackSize() {
        return position + 1;
    }

    public void pushAll(Collection<? extends E> elements) {
        position += elements.size();
        stack.addAll(elements);
    }

    public void popAll(Collection<? super E> dst) {
        dst.addAll(stack);
    }
}
