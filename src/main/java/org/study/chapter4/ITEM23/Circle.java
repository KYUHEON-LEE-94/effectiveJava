package org.study.chapter4.ITEM23;

/**
 * packageName    : org.study.chapter4.ITEM23
 * fileName       : Circle
 * author         : heon
 * date           : 2024-03-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-20           heon               최초 생성
 */
public class Circle extends Figure{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
