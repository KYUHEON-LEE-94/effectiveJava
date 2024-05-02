package org.study.chapter8.ITEM51;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter8.ITEM51
 * fileName       : CardGameTest
 * author         : heon
 * date           : 2024-05-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02           heon               최초 생성
 */
class CardGameTest {

    @Test
    void test() {
        CardGame cardGame = new CardGame();

        // 호출시 //
        // 원하는 값만 순서에 상관없이 설정 가능
        cardGame.inputGamer(Person.builder()
                .height(199.99)
                .weight(99.02)
                .name("Foo bar").build());
    }

}