package org.study.chapter11.ITEM79;

/**
 * @author : heon
 * @Description : SetObserver.java
 * @since : 2024-06-17
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-17       heon         최초 생성
 *
 * <pre>
 */
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
