package org.study.chapter4.ITEM17;

/**
 * packageName    : org.study.chapter4.ITEM17
 * fileName       : Money
 * author         : heon
 * date           : 2024-03-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-12           heon               최초 생성
 */
public final class Wallet {
    private final int money;
    private final String[] cards;

    public Wallet(int money, String[] cards) {
        this.money = money;
        this.cards = cards;
    }

    //피연산자에 함수를 적용해 그 결과를 반환하지만, 피연산자 자체는 그대로인 프로그래밍 패턴을 함수형 프로그래밍 이라고 부른다.
    public Wallet plus(int plusMoney) {
        return new Wallet(this.money+plusMoney, this.cards);
    }

    public String[] getCards() {
        return cards.clone();
    }
}
