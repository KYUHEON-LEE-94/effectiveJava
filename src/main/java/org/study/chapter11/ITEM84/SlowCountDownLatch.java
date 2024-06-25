package org.study.chapter11.ITEM84;

/**
 * @author : heon
 * @Description : SlowCountDownLatch.java
 * @since : 2024-06-25
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-25       heon         최초 생성
 *
 * <pre>
 */
public class SlowCountDownLatch {
    private int count;

    public SlowCountDownLatch(int count) {
        if (count < 0)
            throw new IllegalArgumentException(count + " < 0");
        this.count = count;
    }

    public void await() { // 바쁜 대기 중 (so bad ~~~)
        while (true) {
            synchronized(this) {
                if (count == 0)
                    return;
            }
        }
    }

    public synchronized void countDown() {
        if (count != 0)
        count--;
    }
}
