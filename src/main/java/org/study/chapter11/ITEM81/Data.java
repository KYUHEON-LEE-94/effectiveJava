package org.study.chapter11.ITEM81;

/**
 * @author : heon
 * @Description : Data.java
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
public class Data {
    private String packet;

    private boolean transfer = true;

    /*transfer가 True인 경우만 가능*/
    public synchronized void send(String packet) {
        while (!transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
            }
        }
        transfer = false;

        this.packet = packet;
        notifyAll();
    }

    /*transfer가 False인 경우만 가능*/
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt();
            }
        }
        transfer = true;

        notifyAll();
        return packet;
    }
}
