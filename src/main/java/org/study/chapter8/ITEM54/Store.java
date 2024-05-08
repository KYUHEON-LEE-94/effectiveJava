package org.study.chapter8.ITEM54;

import java.util.*;

/**
 * packageName    : org.study.chapter8.ITEM54
 * fileName       : Store
 * author         : heon
 * date           : 2024-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-08           heon               최초 생성
 */
public class Store {
    private final Map<String, List<String>> ItemMap = new HashMap<>(){{
        put("음료",List.of("포카리","이프로","파워에이드"));
        put("과자",List.of());
    }};

    public List<String> getItem(String category){
        List<String> items = ItemMap.get(category);
        return items.isEmpty() ? Collections.emptyList() : new ArrayList<>(items);
    }

    public static void main(String[] args){
        Store store = new Store();
        List<String> items = store.getItem("과자"); // 참조 값이 null 일 수도 있음

        if(items == null){ // null 체크 로직이 반드시 들어가야함
            System.out.println("텅텅 비어있어요");
        }else{
            items.forEach(System.out::println);
        }
    }
}
