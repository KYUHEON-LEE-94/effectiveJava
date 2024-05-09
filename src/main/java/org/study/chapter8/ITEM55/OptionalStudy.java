package org.study.chapter8.ITEM55;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

/**
 * @author : heon
 * @Description : OptionalStudy.java
 * @since : 2024-05-09
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-09       heon         최초 생성
 *
 * <pre>
 */
public class OptionalStudy {
    public static <E extends Comparable<E>> Optional<E> max (Collection<E> c){
        if(c.isEmpty())
            return Optional.empty();

        E result = null ;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0){
                result = Objects.requireNonNull(e);
            }
        return  Optional.of(result);
    }

    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
}
