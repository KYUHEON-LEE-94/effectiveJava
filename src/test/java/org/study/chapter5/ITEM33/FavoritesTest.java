package org.study.chapter5.ITEM33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName    : org.study.chapter5.ITEM33
 * fileName       : FavoritesTest
 * author         : heon
 * date           : 2024-04-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-02           heon               최초 생성
 */
class FavoritesTest {

    @Test
    void 타입_안전_이종_컨테이너_패턴(){
        Favorites favorites = new Favorites();

        String testString = "Effective java";
        Integer testInt = 1;
        Class testClass = FavoritesTest.class;

        favorites.putFavorite(String.class, testString);
        favorites.putFavorite(Integer.class, testInt);
        favorites.putFavorite(Class.class, testClass);

        System.out.println("favorites = " + favorites);
        assertEquals(favorites.getFavorite(String.class), testString);
        assertEquals(favorites.getFavorite(Integer.class), testInt);
        assertEquals(favorites.getFavorite(Class.class), testClass);
    }

    @Test()
    void 로_타입_사용_시_예외_빌생() {
        // given
        Favorites f = new Favorites();

        String testString = "Effective Java";

        // when
        assertThrows(ClassCastException.class, ()->{
            f.putFavorite((Class)Integer.class, testString);
        });
    }
}