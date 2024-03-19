package org.study.chapter4.ITEM22;

/**
 * packageName    : org.study.chapter4.ITEM22
 * fileName       : ConstantImpl
 * author         : heon
 * date           : 2024-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-19           heon               최초 생성
 */
public class ConstantImpl implements Constant{
    public static void main(String[] args) {
        double area = getArea(2);
        System.out.println("area = " + area);
    }

    private static double getArea(double r) {
        return PI * r * r;
    }
}
