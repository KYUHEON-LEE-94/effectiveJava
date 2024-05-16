package org.study.chapter9.ITEM59;

import java.util.Random;

/**
 * @author : heon
 * @Description : TestMain.java
 * @since : 2024-05-16
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-16       heon         최초 생성
 *
 * <pre>
 */
public class TestMain {
    static Random rnd = new Random();
    static int random(int n){
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1_000_000; ++i)
            if (random(n) < n/2)
                low++;
        System.out.println(low);
    }
}
