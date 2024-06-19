package org.study.chapter11.ITEM81.upperJava5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author : heon
 * @Description : SyncData.java
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
public class SyncData {
    /*synchronized를 사용하지 않고 최적화한 유틸리티*/
    private BlockingQueue<String> packets;

    public SyncData() {
        this.packets = new ArrayBlockingQueue<>(16);
    }

    public void send(String packet) {
        this.packets.offer(packet);
    }

    public String receive() {
        try {
            return packets.take();
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}
