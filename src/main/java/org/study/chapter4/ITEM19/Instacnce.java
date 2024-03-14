package org.study.chapter4.ITEM19;

/**
 * packageName    : org.study.chapter4.ITEM19
 * fileName       : Instacnce
 * author         : heon
 * date           : 2024-03-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-14           heon               최초 생성
 */
public class Instacnce {

    private Instacnce() {
    }

    public static Instacnce now(){
        return new Instacnce();
    }
}
