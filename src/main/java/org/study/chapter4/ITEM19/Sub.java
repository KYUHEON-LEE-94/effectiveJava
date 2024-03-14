package org.study.chapter4.ITEM19;

/**
 * packageName    : org.study.chapter4.ITEM19
 * fileName       : Sub
 * author         : heon
 * date           : 2024-03-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-14           heon               최초 생성
 */
public class Sub extends Super{
    String value;
    @Override
    public void overrideMe() {
        System.out.println("sub mehtod");
        System.out.println(value);  // 테스트 시 이 부분에 null 이 출력 됨
        type = "sub";
    }
    @Override
    public Sub clone() throws CloneNotSupportedException {
        Sub clone = (Sub) super.clone();
        clone.value = "temp";
        return clone;
    }
}
