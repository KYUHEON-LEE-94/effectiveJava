package org.study.chapter10.ITEM69;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author : heon
 * @Description : MountainTest.java
 * @since : 2024-05-29
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-29       heon         최초 생성
 *
 * <pre>
 */
class MountainTest {

    @Test
    void climb() throws InterruptedException {
        List<Mountain> range = Arrays.asList(new Mountain(), new Mountain(), new Mountain());
        for (Mountain m : range) {
            m.climb();
        }
    }

}