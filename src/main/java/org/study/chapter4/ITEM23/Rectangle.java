package org.study.chapter4.ITEM23;

/**
 * packageName    : org.study.chapter4.ITEM23
 * fileName       : Rectangle
 * author         : heon
 * date           : 2024-03-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-20           heon               최초 생성
 */
public class Rectangle extends Figure{
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
