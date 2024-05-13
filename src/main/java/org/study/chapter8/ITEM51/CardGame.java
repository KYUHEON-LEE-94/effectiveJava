package org.study.chapter8.ITEM51;

import lombok.extern.log4j.Log4j2;
import org.study.chapter7.ITEM45.Suit;

/**
 * packageName    : org.study.chapter8.ITEM51
 * fileName       : CardGame
 * author         : heon
 * date           : 2024-05-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02           heon               최초 생성
 */

public class CardGame {
/*
   public boolean compareCards(int myCardRank, Suit myCardSuit, int otherCardRank, Suit otherCardSuit){
         숫자와 무늬 합이 누가 큰가?
         ... Logic
       return false;
    }
*/
    /** 위와 비교해보면 class를 생성함으로서 매개인자 개수를 줄였다. **/
    public boolean compareCards(Card myCard, Card otherCard){
        // 숫자와 무늬 합이 누가 큰가?
        return false;
    }

    public static class Card{
        private final int rank;
        private final Suit suit;
        public Card(int rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }
    }

    /*
    public void inputGamer(String name, double height, double weight, boolean hair, int age){

		Logic
		매개변수가 너무 많다.
    }
    */

    public void inputGamer(Person person){
        System.out.println("person = " + person);
        // Logic
    }
}
