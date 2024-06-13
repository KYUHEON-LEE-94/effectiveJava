package org.study.chapter11.ITEM78;

import java.util.concurrent.TimeUnit;

/**
 * @author : heon
 * @Description : StopThreadSync.java
 * @since : 2024-06-13
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-13       heon         최초 생성
 *
 * <pre>
 */
public class StopThreadSync {
    private static boolean stopRequested;

    // write
    private static synchronized void requestStop() {
        stopRequested = true;
    }

    // read
    private static synchronized boolean stopRequest() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            int i = 0;

            while (!stopRequest()) {
                i++;
            }
        });

        thread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
