package org.study.chapter4.ITEM21.defaultExam;

/**
 * packageName    : org.study.chapter4.ITEM21.defaultExam
 * fileName       : SportCar
 * author         : heon
 * date           : 2024-03-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18           heon               최초 생성
 */
public interface SportCar {
    void setOutput(int output);
    int getOutput();

    //구현하지 않아도 되는 메서드
    default void setBoosterOutput() {
        setOutput(getOutput() * 2);
    }
}
