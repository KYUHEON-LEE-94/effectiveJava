package org.study.chapter3.ITEM15;

import java.io.Serializable;
import java.util.Objects;

/**
 * packageName    : org.study.chapter3.ITEM15
 * fileName       : Id
 * author         : heon
 * date           : 2024-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08           heon               최초 생성
 */
public class Id <T, ID extends Serializable>{

    private final ID id;

    private Id(ID id) {
        this.id = id;
    }

    public static <T, ID extends Serializable> Id<T, ID> of(ID id) {
        return new Id<>(id);
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id<?, ?> id1 = (Id<?, ?>) o;
        return Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }
}
