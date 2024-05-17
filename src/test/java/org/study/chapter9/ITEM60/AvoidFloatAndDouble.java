package org.study.chapter9.ITEM60;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author : heon
 * @Description : AvoidFloatAndDouble.java
 * @since : 2024-05-17
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-17       heon         최초 생성
 *
 * <pre>
 */
public class AvoidFloatAndDouble {
    @Test
    void 부동소수점_부정확(){
        double result = 1.03 - 0.42;
        System.out.println(result); // 0.6100000000000001
        assertNotEquals(result, 0.61);
    }
    @Test
    void BigDecimal을_활용한_연산() {
        BigDecimal b1 = new BigDecimal("1.03");
        BigDecimal b2 = new BigDecimal("0.42");
        String result = b1.subtract(b2).toString();
        System.out.println(result);	//0.61
        assertEquals(result,"0.61");
    }

    @Test
    void 정수활용(){
        int itemsBought = 0;
        int funds = 100;
        for(int price=10; funds >= price; price+=10){
            funds -= price;
            itemsBought ++;
        }

        System.out.println("itemsBought = " + itemsBought);	//0.61
        System.out.println("Cash left over" + funds + " cents");	//0.61
    }
}
