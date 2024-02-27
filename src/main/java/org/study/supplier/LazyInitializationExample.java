package org.study.supplier;

import java.util.function.Supplier;

/**
 * packageName    : org.study.supplier
 * fileName       : LazyInitializationExample
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class LazyInitializationExample {
    // 지연 초기화를 위한 Supplier
    private Supplier<ExpensiveObject> expensiveObjectSupplier = this::createExpensiveObject;

    // 비용이 많이 드는 객체 생성 메서드
    private ExpensiveObject createExpensiveObject() {
        // 여기에서 복잡한 초기화 로직이 수행될 수 있음
        return new ExpensiveObject();
    }

    // 지연 초기화된 객체를 반환하는 메서드
    public ExpensiveObject getExpensiveObject() {
        return expensiveObjectSupplier.get();
    }
}
