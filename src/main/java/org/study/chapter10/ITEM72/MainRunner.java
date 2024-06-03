package org.study.chapter10.ITEM72;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author : heon
 * @Description : MainRunner.java
 * @since : 2024-06-03
 * 1. IllegalArgumentException
 * 2. IllegalStateException
 * 3. NullPointerException
 * 4. IndexOutOfBoundsException
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-03       heon         최초 생성
 *
 * <pre>
 */
public class MainRunner {
    List<Integer> list = new ArrayList<>();

    public void positiveAdd(Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수값은 허용하지 않음");
        }
        list.add(number);
    }

    public void evenIndexAdd(Integer number){
        if(list.size()%2 != 0){
            throw new IllegalStateException("짝수 인덱스에 들어갈 준비가 되지 않음");
        }
        list.add(number);
    }

    public void add(Integer number){
        if(Objects.isNull(number)){
            throw new NullPointerException("값이 null 입니다.");
        }

        if(list.size()>1){
            throw new IndexOutOfBoundsException("요소를 3개 이상 설정 할 수 없습니다.");
        }

        list.add(number);
    }

    public static void main(String[] args) {
        MainRunner mainRunner = new MainRunner();

        mainRunner.positiveAdd(-1);

        mainRunner.evenIndexAdd(0);
        mainRunner.evenIndexAdd(1);

        mainRunner.add(null);

        mainRunner.add(1);
        mainRunner.add(2);
        mainRunner.add(3);
    }
}
