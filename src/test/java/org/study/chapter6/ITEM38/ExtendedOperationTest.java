package org.study.chapter6.ITEM38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter6.ITEM38
 * fileName       : ExtendedOperationTest
 * author         : heon
 * date           : 2024-04-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-08           heon               최초 생성
 */
class ExtendedOperationTest {
    @Test
    void test(){
        double x = Double.parseDouble("1.1");
        double y = Double.parseDouble("1.2");
        test(ExtendedOperation.class, x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

    @Test
    void test2(){
        double x = Double.parseDouble("1.1");
        double y = Double.parseDouble("1.2");
        test(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void test(Collection<? extends Operation> opSet,
                             double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

    @Test
    void test3(){
        double x = Double.parseDouble("1.1");
        double y = Double.parseDouble("1.2");
        test(Arrays.asList(BasicOperation.values()), x, y);
    }

}