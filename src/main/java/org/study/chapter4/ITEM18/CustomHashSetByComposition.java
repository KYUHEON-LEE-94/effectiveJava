package org.study.chapter4.ITEM18;

import java.util.Collection;
import java.util.HashSet;

/**
 * packageName    : org.study.chapter4.ITEM18
 * fileName       : CustomHashSetByComposition
 * author         : heon
 * date           : 2024-03-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-13           heon               최초 생성
 */
public class CustomHashSetByComposition<E> {

    private final HashSet<E> hashSet;
    private int addCount = 0;

    public CustomHashSetByComposition(HashSet<E> hashSet) {
        this.hashSet = hashSet;
    }

    public boolean add(E e) {
        addCount++;
        return hashSet.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return hashSet.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
