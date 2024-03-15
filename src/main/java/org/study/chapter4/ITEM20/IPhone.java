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
public class IPhone extends AbstractPhone implements Phone {
    @Override
    public void greeting() {
        System.out.println("I am iPhone");
    }
}
