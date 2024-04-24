package org.study.chapter7.ITEM48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : org.study.chapter7.ITEM48
 * fileName       : OrderVSParallel
 * author         : heon
 * date           : 2024-04-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24           heon               최초 생성
 */
public class ParallelStream {
    public static void work(int value) {
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {}
    }

    public static long sequenceTest(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach(ParallelStream::work);
        long end = System.nanoTime();
        long runTime = end - start;

        return runTime;
    }

    public static long parallelTest(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach(ParallelStream::work);
        long end = System.nanoTime();
        long runTime = end - start;

        return runTime;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

        // 순차 스트림 처리 시간
        long timeSequence = sequenceTest(list);

        // 병렬 스트림 처리 시간
        long timeParallel = parallelTest(list);

        if (timeSequence < timeParallel) {
            System.out.println("결과: 순차 처리가 더 빠름");
        } else {
            System.out.println("결과: 병렬 처리가 더 빠름");
        }

    }
}
