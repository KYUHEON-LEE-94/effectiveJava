package org.study.supplier;

/**
 * packageName    : org.study
 * fileName       : ${NAME}
 * author         : heon
 * date           : ${DATE}
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * ${DATE}           heon               최초 생성
 */
public class SupplierMain {
    public static void main(String[] args) {
        LazyInitializationExample example = new LazyInitializationExample();

        // 필요한 시점에 객체 생성
        ExpensiveObject expensiveObject = example.getExpensiveObject();

        // 생성된 객체 사용
        expensiveObject.doSomething();
    }
}