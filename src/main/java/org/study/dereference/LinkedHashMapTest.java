package org.study.dereference;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * packageName    : org.study.dereference
 * fileName       : LinkedHashMapTest
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(1000, 0.75f, true) {

            private final static int MAX = 10;

            protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
                return size() >= MAX;
            }
        };

        for (int i = 0; i < 20; i++) {
            map.put(i, i);
        }

        for (Map.Entry<Integer, Integer> string : map.entrySet()) {
            System.out.println(string);
        }
    }
}
