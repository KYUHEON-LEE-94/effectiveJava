package org.study.chapter11.ITEM78;

/**
 * @author : heon
 * @Description : ThreadExample.java
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
public class ThreadExample {
    public static void main(String[] args) {
        // Runnable 인터페이스를 구현하여 스레드 생성
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000); // 1초 동안 일시 정지
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // 스레드 시작
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
