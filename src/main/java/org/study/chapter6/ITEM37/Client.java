package org.study.chapter6.ITEM37;

import java.util.*;

/**
 * packageName    : org.study.chapter6.ITEM37
 * fileName       : Client
 * author         : heon
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05           heon               최초 생성
 */
public class Client {
    public void addPlantTypeEnumMap(List<Plant> garden) {
        Map<Plant.LifeCycle, Set<Plant>> plantByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantByLifeCycle.put(lc, new HashSet<>());
        }

        for (Plant p : garden) {
            plantByLifeCycle.get(p.lifeCycle).add(p);
        }

        System.out.println(plantByLifeCycle);
    }
}
