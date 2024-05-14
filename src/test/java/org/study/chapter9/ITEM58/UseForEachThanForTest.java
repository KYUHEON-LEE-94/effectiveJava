package org.study.chapter9.ITEM58;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author : heon
 * @Description : UseForEachThanForTest.java
 * @since : 2024-05-14
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-14       heon         최초 생성
 *
 * <pre>
 */
class UseForEachThanForTest {

    @Test
    void 평범한_for(){
        List<String> fruits = List.of("Apple", "Orange", "Melon", "Lemon", "Banana");
        int[] numbers = {1, 2, 3, 4, 5};

        for (Iterator<String> iter = fruits.iterator(); iter.hasNext();) {
            String fruit = iter.next();
            System.out.println("iter = " + fruit);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("fruits.get(i) = " + fruits.get(i));
        }
    }

    @Test
    void forEach(){
        List<String> fruits = List.of("Apple", "Orange", "Melon", "Lemon", "Banana");

        for (String fruit : fruits) {
            System.out.println("fruits = " + fruit);
        }

    }

    @Test
    void 주사위2번_굴릴때_경우의수() {
        enum Face {ONE, TWO, THREE, FOUR, FIVE, SIX}

        Collection<Face> faces = EnumSet.allOf(Face.class);

        for (Iterator<Face> i = faces.iterator(); i.hasNext(); ) {
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
                System.out.print(i.next() + " " + j.next() + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for (Face face : faces) {
            for (Face face1 : faces) {
                System.out.print(face + " " + face1 + ", ");
            }
            System.out.println();
        }
    }

    @Test
    void 파괴적인필터링(){
        List<String> list = List.of("A", "B", "C", "D");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String element = iterator.next();

            if(element.equals("A")) iterator.remove();
        }
    }

    @Test
    void 변형(){
        List<String> list = List.of("A", "B", "C", "D");

        String[] arr = new String[]{"A", "B", "C"};

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if ("a".equals(s)) {
                arr[i] = "d";
            }
        }
    }
}