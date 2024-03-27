package org.study.chapter5.ITEM30;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : org.study.chapter5.ITEM30
 * fileName       : Modified
 * author         : heon
 * date           : 2024-03-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27           heon               최초 생성
 */
public class Modified {
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
