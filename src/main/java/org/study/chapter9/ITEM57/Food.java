package org.study.chapter9.ITEM57;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author : heon
 * @Description : Food.java
 * @since : 2024-05-13
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-13       heon         최초 생성
 *
 * <pre>
 */
public class Food {
    /*while 문 보다는 for 문이 좋다.*/

/*    public static void main(String[] args) {

        List<String> like = Arrays.asList("닭", "강", "정");
        Iterator<String> i = like.iterator();

        while(i.hasNext()) {
            System.out.print(i.next());
        }

        List<String> hate = Arrays.asList("피", "망");
        Iterator<String> i = hate.iterator();
        //잘못된지 알 수 가 없다.
        while(i.hasNext()) {
            System.out.print(i2.next());
        }
    }*/

    public static void main(String[] args) {

        List<String> like = Arrays.asList("닭", "강", "정");
        for (Iterator<String> i = like.iterator(); i.hasNext();) {
            System.out.print(i.next());
        }

        List<String> hate = Arrays.asList("피", "망");
        //잘못된 부분을 컴파일 단계에서 잡을 수 있다.
        //for (Iterator<String> i2 = hate.iterator(); i.hasNext();) {
        for (Iterator<String> i2 = hate.iterator(); i2.hasNext();) {
                System.out.print(i2.next());
        }
    }
}
