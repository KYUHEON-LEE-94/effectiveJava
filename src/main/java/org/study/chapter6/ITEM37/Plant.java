package org.study.chapter6.ITEM37;

/**
 * packageName    : org.study.chapter6.ITEM37
 * fileName       : Plant
 * author         : heon
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05           heon               최초 생성
 */
public class Plant {
    enum LifeCycle{
        ANNUAL,
        PERENNIAL,
        BIENNIAL
    }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

}
