package org.study.chapter11.ITEM81.upperJava5;

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
public class Receiver implements Runnable {
    private SyncData syncData;

    public Receiver(SyncData syncData) {
        this.syncData = syncData;
    }

    @Override
    public void run() {
        for (String received = syncData.receive(); !"End".equals(received); received = syncData.receive()) {
            System.out.println(received);
        }
    }
}