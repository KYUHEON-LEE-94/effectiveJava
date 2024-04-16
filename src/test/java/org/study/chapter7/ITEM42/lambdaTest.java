package org.study.chapter7.ITEM42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.study.chapter6.ITEM35.Ensemble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : org.study.chapter7.ITEM42
 * fileName       : lambdaTest
 * author         : heon
 * date           : 2024-04-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-16           heon               최초 생성
 */
public class lambdaTest {
    @Test
    @DisplayName("자바8 이전에 사용하던 익명클래스")
    void anonymousClass() {
        List<String> word = new ArrayList<>(List.of("ab", "abc", "a"));

        Collections.sort(word, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Collections.sort(word, Comparator.comparingInt(String::length));
    }

    @Test
    @DisplayName("로 타입 List 임으로 타입추론 불가(컴파일에러)")
    void compileError(){
       // List word = new ArrayList(List.of("ab","abc","a"));
        //Collections.sort(word,(s1, s2) -> Integer.compare(s1.length(),s2.length()));
    }
}
