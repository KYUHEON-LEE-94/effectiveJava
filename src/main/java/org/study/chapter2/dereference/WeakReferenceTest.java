package org.study.chapter2.dereference;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * packageName    : org.study.dereference
 * fileName       : WeakReference
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class WeakReferenceTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        map.put(key1, "test a");
        map.put(key2, "test b");

        key1 = null;

        System.gc();  //강제 Garbage Collection

        map.entrySet().stream().forEach(el -> System.out.println("map : "+el));


        Map<Integer, String> weakHashMap = new WeakHashMap<>();

        key1 = 1000;
        key2 = 2000;

        weakHashMap.put(key1, "test a");
        weakHashMap.put(key2, "test b");

        key1 = null;

        System.gc();  //강제 Garbage Collection

        weakHashMap.entrySet().stream().forEach(el -> System.out.println("weakHashMap : "+el));
    }

}
