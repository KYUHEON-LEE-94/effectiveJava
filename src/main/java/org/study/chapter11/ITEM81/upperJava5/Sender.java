package org.study.chapter11.ITEM81.upperJava5;

import java.util.Arrays;
import java.util.List;

/**
 * @author : heon
 * @Description : ㄴ둥ㄷㄱ.java
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
public class Sender implements Runnable {
    private SyncData syncData;

    public Sender(SyncData syncData) {
        this.syncData = syncData;
    }

    @Override
    public void run() {
        List<String> packets = Arrays.asList(
                "First packet",
                "Second packet",
                "Third packet",
                "Fourth packet",
                "End"
        );

        packets.forEach(packet -> syncData.send(packet));
    }
}
