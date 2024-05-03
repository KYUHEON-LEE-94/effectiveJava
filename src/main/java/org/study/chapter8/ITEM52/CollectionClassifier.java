package org.study.chapter8.ITEM52;

import java.math.BigInteger;
import java.util.*;

/**
 * packageName    : org.study.chapter8.ITEM52
 * fileName       : CollectionClassifier
 * author         : heon
 * date           : 2024-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-03           heon               최초 생성
 */
public class CollectionClassifier {

    public static String classify(Set<?> s) {
        return "Set";
    }
    public static String classify(List<?> lst) {
        return "List";
    }
    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            System.out.println(classify(c));
        }
    }

}
