package org.study.chapter6.ITEM40;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : org.study.chapter6.ITEM40
 * fileName       : Bigram
 * author         : heon
 * date           : 2024-04-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-11           heon               최초 생성
 */
public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object bigram) {
        if(!(bigram instanceof Bigram)) {
            return false;
        }
        Bigram b = (Bigram) bigram;
        return b.first == this.first &&
                b.second == this.second;
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram(ch, ch));
            }
        }

        System.out.println(s.size()); //260
    }
}
