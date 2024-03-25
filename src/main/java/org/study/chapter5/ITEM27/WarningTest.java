package org.study.chapter5.ITEM27;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : org.study.chapter5.ITEM27
 * fileName       : WarningTest
 * author         : heon
 * date           : 2024-03-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-25           heon               최초 생성
 */
public class WarningTest {
    @SuppressWarnings("unchecked")
    class ClassWarning {

        public Set<String> hello() {
            return new HashSet();
        }
    }

    class MethodWarning {

        @SuppressWarnings("unchecked")
        public Set<String> hello() {
            return new HashSet();
        }
    }

    class FieldWarning {

        @SuppressWarnings("unchecked")
        Set<String> set = new HashSet();
    }
}
