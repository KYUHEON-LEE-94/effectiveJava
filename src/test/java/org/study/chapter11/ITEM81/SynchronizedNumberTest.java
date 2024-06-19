package org.study.chapter11.ITEM81;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : heon
 * @Description : SynchronizedNumberTest.java
 * @since : 2024-06-19
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-19       heon         최초 생성
 *
 * <pre>
 */
class SynchronizedNumberTest {
    @Test
    void synchronizedMethod_versus_nonSynchronized() {
        SynchronizedNumber synchronizedNumber = new SynchronizedNumber(1);

        long start = System.nanoTime();
        IntStream.rangeClosed(1, 100_000_000)
                .forEach(notUse -> synchronizedNumber.get());
        long end = System.nanoTime();

        System.out.println("nonSynchronized: " + (end - start) + "ns");

        start = System.nanoTime();
        IntStream.rangeClosed(1, 100_000_000)
                .forEach(notUse -> synchronizedNumber.syncGet());
        end = System.nanoTime();

        System.out.println("synchronized: " + (end - start) + "ns");
    }
}