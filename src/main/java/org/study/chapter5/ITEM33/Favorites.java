package org.study.chapter5.ITEM33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * packageName    : org.study.chapter5.ITEM33
 * fileName       : Favorites
 * author         : heon
 * date           : 2024-04-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-02           heon               최초 생성
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> Type, T instance){
        favorites.put(Objects.requireNonNull(Type), Type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type){
        return type.cast(favorites.get(type));
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "favorites=" + favorites +
                '}';
    }
}
