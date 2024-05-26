package org.study.chapter9.ITEM61;

import org.apache.commons.lang3.function.FailableShortSupplier;
import org.junit.jupiter.api.Test;
import org.study.chapter4.ITEM17.Wallet;

import javax.sql.XADataSource;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author : heon
 * @Description : AvoidFloatAndDouble.java
 * @since : 2024-05-17
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-17       heon         최초 생성
 *
 * <pre>
 */
public class NoUseBoxingType {

    @Test
    void 예상한_결과가_아니다(){
        Comparator<Integer> naturalOrder = (i, j) -> (i < j) ? -1: (i == j ? 0 : 1);
        int compare = naturalOrder.compare(Integer.valueOf(42), Integer.valueOf(42));
        assertEquals(compare, 0);
    }

    @Test
    void 언박싱_비교(){
        Comparator<Integer> naturalOrder = (boxedI ,boxedJ) -> {
            int i = boxedI, j = boxedJ;
            return (i < j) ? -1 : (i == j) ? 0 : -1;
        };
    }

    @Test
    void Long과_long(){
        long startTime = System.nanoTime();
//        Long sum = 0L;
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1;
        }
        long endTime = System.nanoTime();
        double elapsedTimeSeconds = (endTime - startTime) / (double) 1_000_000_000;

        System.out.println("how long did it take? : " + elapsedTimeSeconds + " seconds");
    }

}
