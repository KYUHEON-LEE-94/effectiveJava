package org.study.chapter6.ITEM39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * packageName    : org.study.chapter6.ITEM39
 * fileName       : RunTests
 * author         : heon
 * date           : 2024-04-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09           heon               최초 생성
 */
public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
            int tests = 0; int passed = 0;
            Class<?> testClass = Class.forName(args[0]);
            for (Method m : testClass.getDeclaredMethods()) {
                if (m.isAnnotationPresent(Test.class)) {
                    tests++;
                    try {
                        m.invoke(null);
                        passed++;
                    } catch (InvocationTargetException wrappedExc) {
                        Throwable exc = wrappedExc.getCause();
                        System.out.println(m + " 실패: " + exc);
                    } catch (Exception exc) {
                        System.out.println("잘못 사용한 @Test: " + m); } }
            }
            System.out.printf("성공: %d, 실패: %d%n", passed, tests - passed);
    }
}
