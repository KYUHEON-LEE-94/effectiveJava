package org.study.chapter6.ITEM38;

/**
 * packageName    : org.study.chapter6.ITEM38
 * fileName       : ExtendedOperation
 * author         : heon
 * date           : 2024-04-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-08           heon               최초 생성
 */
public enum ExtendedOperation implements Operation{
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };
    private final String symbol;
    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
}
