package org.study.chapter4.ITEM23;

/**
 * packageName    : org.study.chapter4.ITEM23
 * fileName       : Square
 * author         : heon
 * date           : 2024-03-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-20           heon               최초 생성
 */
public class Square extends Figure{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
