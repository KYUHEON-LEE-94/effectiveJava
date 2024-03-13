package org.study.chapter4.ITEM18;

import java.util.Collection;
import java.util.HashSet;

/**
 * packageName    : org.study.chapter4.ITEM18
 * fileName       : CustomHashSetByInheritance
 * author         : heon
 * date           : 2024-03-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13           heon               최초 생성
 */
public class CustomHashSetByInheritance<E> extends HashSet<E> {

    private int addCount = 0;

    public CustomHashSetByInheritance() {
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
