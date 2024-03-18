package org.study.chapter4.ITEM21;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : org.study.chapter4.ITEM21.defaultExam
 * fileName       : RemoveIf
 * author         : heon
 * date           : 2024-03-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-18           heon               최초 생성
 */
public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        list.removeIf(a -> a ==2);
        System.out.println("list = " + list);

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3);
        System.out.println("list2 = " + list2);

        List<Integer> arrayList = Arrays.asList(1, 2, 3);
        System.out.println("arrayList = " + arrayList);

        List<Integer> streamList = Stream.of(1, 2, 3) .collect(Collectors.toList());
        System.out.println("streamList = " + streamList);
    }
}
