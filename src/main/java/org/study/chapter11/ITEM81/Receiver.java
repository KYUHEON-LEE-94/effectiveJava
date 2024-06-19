package org.study.chapter11.ITEM81;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : heon
 * @Description : Receiver.java
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
public class Receiver implements Runnable{
    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    public void run() {
        for(String receivedMessage = load.receive();
                !"End".equals(receivedMessage);
                receivedMessage = load.receive()) {

            System.out.println(receivedMessage);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
