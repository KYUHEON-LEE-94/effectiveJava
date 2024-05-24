package org.study.chapter9.ITEM65;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : heon
 * @Description : StudyInfoTest.java
 * @since : 2024-05-21
 *
 * 프로그래스 문제: 문자열 정렬을 참고로한 테스트
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-20       heon         최초 생성
 *
 * <pre>
 */
class ReflectionExam {


    @Test
    void test(){
        String[] args = {"test"};

        Class<? extends Set<String>> cl = null;
        try {
            // 여기서 args[0] 의 인자에 의해 클래스가 결정된다.
            // args[0] 이 무엇인지에 따라 동작이 달라진다.
            cl = (Class<? extends Set<String>>) Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("클래스를 찾을 수 없습니다 !!");
        }

        Constructor<? extends Set<String>> cons = null;
        try {
            cons = cl.getConstructor();
        } catch (NoSuchMethodException e) {
            System.err.println("매개변수없는 생성자가 없습니다 !!");
        }

        Set<String> s = null;
        try {
            s = cons.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("생성자에 접근할 수 없습니다.");
        } catch (InstantiationException e) {
            System.err.println("클래스를 인스턴스화할 수 없습니다.");
        } catch (InvocationTargetException e) {
            System.err.println("생성자가 예외를 던졌습니다." + e.getCause());
        } catch (ClassCastException e) {
            System.err.println("Set 을 구현하지 않은 클래스입니다.");
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }

}