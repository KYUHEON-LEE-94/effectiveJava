package org.study.chapter10.ITEM73;

import org.junit.jupiter.api.Test;

/**
 * @author : heon
 * @Description : Test.java
 * @since : 2024-06-04
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-04       heon         최초 생성
 *
 * <pre>
 */
public class ExceptionTest {
    @Test
    void climb() throws InterruptedException {
        try {
            // 예외 생성
            NumberFormatException ex = new NumberFormatException("Exception");

            ex.initCause(new NullPointerException("근본 원인"));
            throw ex;
        } catch (NumberFormatException ex) {
            ex.getCause().printStackTrace();
        }

        //checked exception ->unchecked exception
        throw new RuntimeException(new Exception("런타임 예외로 변경"));
    }
}
