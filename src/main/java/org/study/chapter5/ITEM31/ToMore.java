package org.study.chapter5.ITEM31;

import java.util.List;

/**
 * packageName    : org.study.chapter5.ITEM31
 * fileName       : ToMore
 * author         : heon
 * date           : 2024-03-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-28           heon               최초 생성
 */
public abstract class ToMore {

    public <E> void swapExam(List<E> list, int i, int j) {

    }

    public static void swap(List<?> list, int i, int j) {
        helper(list, i, j);
    }

    private static <E> void helper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
}
