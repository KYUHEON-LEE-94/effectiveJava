package org.study.chapter6.ITEM35;

/**
 * packageName    : org.study.chapter6.ITEM35
 * fileName       : Ensemble
 * author         : heon
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04           heon               최초 생성
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians() {
        return numberOfMusicians;
    }
}
