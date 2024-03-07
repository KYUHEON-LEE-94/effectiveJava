package org.study.chapter1.hashCode;

/**
 * packageName    : org.study.hashCode
 * fileName       : SameHashCodeNumber
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
public class SameHashCodeNumber {
    private final int number;

    public SameHashCodeNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SameHashCodeNumber that = (SameHashCodeNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
