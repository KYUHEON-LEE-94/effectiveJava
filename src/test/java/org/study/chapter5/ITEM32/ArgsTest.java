package org.study.chapter5.ITEM32;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter5.ITEM32
 * fileName       : ArgsTest
 * author         : heon
 * date           : 2024-04-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01           heon               최초 생성
 */
class ArgsTest {

    @Test
    @DisplayName("실체화 타입")
    void realizationType(){
        //.java
        String[] strings = new String[3];
        strings[0] = "1";
        strings[1] = "2";
        strings[2] = "3";

        //.class
        String[] var1 = new String[]{"1", "2", "3"};
    }

    @Test
    @DisplayName("실체화 불가 타입")
    void CanNotRealizationType(){
        //.java
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        System.out.println("hello = " + strings);

        //.class
        ArrayList var1 = new ArrayList(); // 타입정보가 사라졌다?
        var1.add("1");
        var1.add("2");
        var1.add("3");
        System.out.println("hello = " + var1);
    }
}