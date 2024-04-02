package org.study.chapter5.ITEM32;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : org.study.chapter5.ITEM32
 * fileName       : TimeCapsule
 * author         : heon
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01           heon               최초 생성
 */
public class TimeCapsule {
    @SafeVarargs
    static <T> List<T> saveCapsule(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    public static void main(String[] args) {
        List<String> timeCapsule = saveCapsule(
                List.of("편지", "인형"), List.of("USB", "편지"), List.of("반지","사진"));
        System.out.println(timeCapsule);
        
        List<Integer> timeCapsule2 = saveCapsule(List.of(3,4), List.of(1,2));

    }
}
