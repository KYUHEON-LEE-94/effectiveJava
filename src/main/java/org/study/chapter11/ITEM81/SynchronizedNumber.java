package org.study.chapter11.ITEM81;

/**
 * @author : heon
 * @Description : SynchronizedNumber.java
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
public class SynchronizedNumber {
    private int number;

    public SynchronizedNumber(int number) {
        this.number = number;
    }

    public int get() {
        return number;
    }

    public synchronized int syncGet() {
        return number;
    }

    public synchronized void syncSet(int number) {
        this.number = number;
    }
}
