package org.study.chapter4.ITEM20;

/**
 * packageName    : org.study.chapter4.ITEM20
 * fileName       : IPhone
 * author         : heon
 * date           : 2024-03-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-15           heon               최초 생성
 */
public class IPhone2 extends PhoneManufacturer implements Phone {
    InnerAbstractPhone innerAbstractPhone = new InnerAbstractPhone(); // 내부 클래스로 정의

    @Override
    public void booting() {
        innerAbstractPhone.booting();
    }

    @Override
    public void greeting() {
        innerAbstractPhone.greeting();
    }

    @Override
    public void shutdown() {
        innerAbstractPhone.shutdown();
    }

    @Override
    public void process() {
        printManuFacturer();
        innerAbstractPhone.process();
    }
}
