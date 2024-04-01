package org.study.chapter5.ITEM32;

import java.util.List;

/**
 * packageName    : org.study.chapter5.ITEM32
 * fileName       : Args
 * author         : heon
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01           heon               최초 생성
 */
public class Args {
    public void print(String ... args){
        for (String s:args) {

        }
    }

    public void print(List<String>... stringList){
        List<Integer> intList = List.of(42);
        Object[] objects = stringList;
        objects[0] = intList;    //3  힙오염 발생
        String s = stringList[0].get(0) ;    //4  ClassCastException
    }
}
