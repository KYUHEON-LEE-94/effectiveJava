package org.study.chapter1.autoCloseable;

import java.lang.ref.Cleaner;

/**
 * packageName    : org.study.autoCloseable
 * fileName       : Restaurant
 * author         : heon
 * date           : 2024-02-28
 * description    : cleaner 안전망으로 활용하는 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
public class Restaurant implements AutoCloseable{
    private static final Cleaner CLEANER = Cleaner.create();

    private static class Table implements Runnable{
        int cups;
        int plates;

        Table(int cups, int plates){
            this.cups = cups;
            this.plates = plates;

        }

        @Override
        public void run() {
            System.out.println("자리 정리중...");
            this.cups = 0;
            this.plates = 0;
        }
    }

    //테이블 상태, cleanable 과 공유
    private final Table table;
    // cleanable 객체. 수거 대상이 되면 테이블 청소
    private final Cleaner.Cleanable cleanable;

    public Restaurant (int cups, int plates) {
        table = new Table(cups, plates);
        cleanable = CLEANER.register(this, table);
    }
    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

}
