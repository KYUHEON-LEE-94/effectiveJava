package org.study.hashCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.study.chapter2.hashCode.DiffHashCodeNumber;
import org.study.chapter2.hashCode.SameHashCodeNumber;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.hashCode
 * fileName       : SameHashCodeNumberTest
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
class SameHashCodeNumberTest {
    @Test
    @DisplayName("hashCode가 동일한 값을 리턴할 때")
    void sameHashCodeNumber() {
        // given
        long start = System.currentTimeMillis();
        Map<SameHashCodeNumber, Integer> sameHashCodeNumbers = IntStream.range(1, 10_000)
                .mapToObj(SameHashCodeNumber::new)
                .collect(Collectors.toMap(sameHashCodeNumber -> sameHashCodeNumber, SameHashCodeNumber::getNumber));

        // when
        Integer actual = sameHashCodeNumbers.get(new SameHashCodeNumber(100));
        long end = System.currentTimeMillis();

        // then
        System.out.println(
                String.format("총 실행 시간: %d", end - start)
        );
        assertEquals(actual,100);
    }

    @Test
    @DisplayName("hashCode가 다른 값을 리턴할 때")
    void diffHashCodeNumber() {
        // given
        long start = System.currentTimeMillis();
        Map<DiffHashCodeNumber, Integer> diffHashCodeNumbers = IntStream.range(1, 10_000)
                .mapToObj(DiffHashCodeNumber::new)
                .collect(Collectors.toMap(diffHashCodeNumber -> diffHashCodeNumber, DiffHashCodeNumber::getNumber));

        // when
        Integer actual = diffHashCodeNumbers.get(new DiffHashCodeNumber(5_000));
        long end = System.currentTimeMillis();

        // then
        System.out.println(
                String.format("총 실행 시간: %d", end - start)
        );
        assertEquals(actual,5000);
    }
}