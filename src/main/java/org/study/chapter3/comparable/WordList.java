package org.study.chapter3.comparable;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * packageName    : org.study.chatper2.comparable
 * fileName       : WordList
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public class WordList {
    public static void main(String[] args) {
        String[] abc = {"A","D","B","C"};
        Set<String> set = new TreeSet<>();
        Collections.addAll(set, abc);
        System.out.println(set);
    }
}
