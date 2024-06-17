package org.study.chapter11.ITEM80;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : heon
 * @Description : WhatIsExecutor.java
 * @since : 2024-06-18
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-18       heon         최초 생성
 *
 * <pre>
 */
public class WhatIsExecutor {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        //큐 실행
        exec.execute(() -> System.out.println("exec = " + exec));
        //큐 종료
        exec.shutdown();
    }
}
