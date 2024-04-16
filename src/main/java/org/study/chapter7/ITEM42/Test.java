package org.study.chapter7.ITEM42;

/**
 * packageName    : org.study.chapter7.ITEM42
 * fileName       : Test
 * author         : heon
 * date           : 2024-04-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-16           heon               최초 생성
 */
public class Test {

    private final int value = 20;

    public Foo foo = new Foo() {
        final int value = 10;
        @Override
        public int anyThing(int i) {
            return i + this.value; //익명 클래스는 인스턴스 자신을 가리킨다.
        }
    };

    public Foo foo2 = i -> i + this.value; //람다는 바깥 인스턴스를 가리킨다.
}