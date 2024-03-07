package org.study.autoCloseable;

import org.junit.jupiter.api.Test;
import org.study.chapter1.autoCloseable.Restaurant;

/**
 * packageName    : org.study.autoCloseable
 * fileName       : RestaurantTest
 * author         : heon
 * date           : 2024-02-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-28           heon               최초 생성
 */
class RestaurantTest {
    @Test
    void quickManager() throws Exception {
        //try-with-resources를 사용하면 AutoCloseable 인터페이스를 구현했으므로 자동으로 close() 메서드가 호출
        try (Restaurant restaurant = new Restaurant(4, 4)){
            System.out.println("즐거운 청소 시작!");
        } finally {
            System.out.println("청소 완료!");
        }
    }

    @Test
    void lazyManager() throws Exception {
        new Restaurant(4, 4);
        System.out.println("언젠간 하지 뭐..");
    }

}