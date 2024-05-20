package org.study.chapter9.ITEM63;

import org.junit.jupiter.api.Test;
import org.study.chapter9.ITEM62.StudyInfo;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : heon
 * @Description : StudyInfoTest.java
 * @since : 2024-05-21
 *
 * 프로그래스 문제: 문자열 정렬을 참고로한 테스트
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-20       heon         최초 생성
 *
 * <pre>
 */
class StringTest {
    String s = "Zbcdefg";

    @Test
    void test(){

        long startTime = System.nanoTime();

        String[] sArray = s.split("");
        Arrays.sort(sArray, Collections.reverseOrder());
        String answer = "";
        for (String sValue : sArray){
            answer += sValue;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Execution time: " + duration + " nanoseconds");

        assertTrue(duration > 0);
    }

    @Test
    void test2(){

        long startTime = System.nanoTime();

        String[] sArray = s.split("");
        Arrays.sort(sArray, Collections.reverseOrder());
        StringBuilder stringBuilder =new StringBuilder();
        for (String sValue : sArray){
            stringBuilder.append(sValue);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Execution time: " + duration + " nanoseconds");

        assertTrue(duration > 0);
    }

    @Test
    void test3(){

        long startTime = System.nanoTime();

        String[] sArray = s.split("");
        Arrays.sort(sArray, Collections.reverseOrder());
        String.join("", sArray);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Execution time: " + duration + " nanoseconds");

        assertTrue(duration > 0);
    }
}