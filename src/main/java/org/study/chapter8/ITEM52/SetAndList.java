package org.study.chapter8.ITEM52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * packageName    : org.study.chapter8.ITEM52
 * fileName       : SetAndList
 * author         : heon
 * date           : 2024-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-03           heon               최초 생성
 */
public class SetAndList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        System.out.println(set + " " + list);

//        for (int i = 0; i < 3; i++) {
//            set.remove(i);
//            list.remove(i);
//        }

        //list에 음수만 남아야 한다면.
        for (int i = 0; i < 3; i++ ){
            set.remove(i);
            list.remove((Integer) i); // remove(Object o) 가 호출됨
        }

        System.out.println(set + " " + list);
    }
}
