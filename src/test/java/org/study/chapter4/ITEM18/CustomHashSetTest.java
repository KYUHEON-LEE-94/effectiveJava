package org.study.chapter4.ITEM18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : org.study.chapter4.ITEM18
 * fileName       : CustomHashSetTest
 * author         : heon
 * date           : 2024-03-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13           heon               최초 생성
 */
public class CustomHashSetTest {
    @DisplayName("더할 때마다 카운트 증가 - 조합")
    @Test
    void addAll_Composition() {
        CustomHashSetByComposition<Integer> customHashSet = new CustomHashSetByComposition<>(new HashSet<>());
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        customHashSet.addAll(numbers);
        customHashSet.add(5);

        assertEquals(customHashSet.getAddCount(), 5);
    }
}
