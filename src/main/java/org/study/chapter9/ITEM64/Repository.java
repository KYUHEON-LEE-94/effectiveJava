package org.study.chapter9.ITEM64;

import java.util.Optional;

/**
 * @author : heon
 * @Description : repository.java
 * @since : 2024-05-23
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-23       heon         최초 생성
 *
 * <pre>
 */
public interface Repository<T> {
    T save(T t);
    Optional<T> get(Long id);
}
