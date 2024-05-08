package org.study.chapter8.ITEM54;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : org.study.chapter8.ITEM54
 * fileName       : NotNull
 * author         : heon
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08           heon               최초 생성
 */
public class NotNull {
    //null 방지1 : 상수처리
    private final List<String> EMPTY_LIST = new ArrayList<>();

    @Test
    @DisplayName("empty 함수 사용")
    void empty_2(){
        Collections.emptyMap();
        Collections.emptyList();
        
    }
}
