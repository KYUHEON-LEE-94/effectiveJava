package org.study.chapter2.hashCode;

import java.util.Objects;

/**
 * packageName    : org.study.hashCode
 * fileName       : DiffHashCodeNumber
 * author         : heon
 * date           : 2024-03-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-04           heon               최초 생성
 */
public class DiffHashCodeNumber {
    private final int number;

    public DiffHashCodeNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiffHashCodeNumber that = (DiffHashCodeNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
