package org.study.chapter6.ITEM37;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

/**
 * packageName    : org.study.chapter6.ITEM37
 * fileName       : Phase
 * author         : heon
 * date           : 2024-04-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-05           heon               최초 생성
 */
public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase from;
        private final Phase to;

        Transition(Phase from, Phase to) {
            this.from = from;
            this.to = to;
        }

        private static final Map<Phase, Map<Phase, Transition>> m =
                Stream.of(values()) // enum 타입 두 개를 매핑한 필드 리스트
                        .collect(
                                groupingBy(
                                        t -> t.from, //
                                        () -> new EnumMap<>(Phase.class),
                                        toMap(
                                                t -> t.to,
                                                t -> t,
                                                (x, y) -> y,
                                                () -> new EnumMap<>(Phase.class)
                                        ))
                        );

        public static Transition from(Phase from, Phase to) {
            return m.get(from).get(to);
        }
    }
}
