package org.study.chapter5.ITEM30;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : org.study.chapter5.ITEM30
 * fileName       : Wrong
 * author         : heon
 * date           : 2024-03-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-27           heon               최초 생성
 */
public class Wrong {
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

}
