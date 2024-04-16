package org.study.chapter7.ITEM42;

import java.util.function.Function;

/**
 * packageName    : org.study.chapter7.ITEM42
 * fileName       : CARD
 * author         : heon
 * date           : 2024-04-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-16           heon               최초 생성
 */
public enum CARD {

    KAKAO("카카오",money->money/100),
    SAMSUNG("삼성",money->money*2/100),
    HYUNDAI("현대",money->money*3/100);

    private final String name;
    private final Function<Integer, Integer> op;

    CARD(String name ,Function<Integer,Integer> op) {
        this.name = name;
        this.op =op;
    }
    public int point(int money){
        return op.apply(money);
    }
    public String getName() {
        return name;
    }
}
