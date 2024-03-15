package org.study.chapter4.ITEM20;

/**
 * packageName    : org.study.chapter4.ITEM20
 * fileName       : AbstractPhone
 * author         : heon
 * date           : 2024-03-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-15           heon               최초 생성
 */
public abstract class AbstractPhone implements Phone {
    // 같은 동작을 하는 메소드를 여기에 정의한다.
    @Override
    public void booting() {
        System.out.println("booting ...");
    }

    @Override
    public void shutdown() {
        System.out.println("shut down ...");
    }

    @Override
    public void process() {
        booting();
        greeting();
        shutdown();
    }
}
