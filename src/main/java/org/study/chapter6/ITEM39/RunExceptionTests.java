package org.study.chapter6.ITEM39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * packageName    : org.study.chapter6.ITEM39
 * fileName       : RunExceptionTests
 * author         : heon
 * date           : 2024-04-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09           heon               최초 생성
 */
public class RunExceptionTests {
    public static void main(String[] args) throws Exception{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("org.study.chapter6.ITEM39.Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                //ExceptionTest 애너테이션을 사용한 메서드 선별
                tests++;
                try {
                    m.invoke(null);
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();	// 애너테이션의 매개변수 타입 확인
                    if (excType.isInstance(exc)) {	// 애너테이션의 매개변수 타입과 같을 경우 통과
                        passed++;
                    }
                } catch (Exception e) {
                    System.out.println("잘못 사용한 테스트 @Test : " + m);
                }
            }
        }
        System.out.printf("suc :: %d, fail : %d%n", passed, tests - passed);
    }
}
