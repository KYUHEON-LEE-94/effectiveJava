package org.study.chapter4.ITEM19;

/**
 * packageName    : org.study.chapter4.ITEM19
 * fileName       : Super
 * author         : heon
 * date           : 2024-03-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-14           heon               최초 생성
 */
public class Super implements Cloneable{
    String type;
    public Super() {
        this.type = "super";
    }
    public void overrideMe() {
        System.out.println("super method");
    }
    @Override
    public Super clone() throws CloneNotSupportedException {
        overrideMe();
        return (Super) super.clone();
    }
}
