package org.study.chapter7.ITEM44;

import javax.security.auth.callback.Callback;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.BiPredicate;

/**
 * packageName    : org.study.chapter7.ITEM44
 * fileName       : UseStandardInterface
 * author         : LEE KYUHEON
 * date           : 2024-04-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-20        LEE KYUHEON       최초 생성
 */
public class UseStandardInterface extends LinkedHashMap{

    protected boolean removeEldestEntry(Map.Entry eldest){
        return size() > 100;
    }

    /*자바 표준 라이브러리에 이미 같은 모양의 인터페이스가 있기 때문에 굳이 사용안함*/
    @FunctionalInterface
    interface EldestEntryRemovalFunction<K, V> {
        boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
    }


    // Comparator
    @FunctionalInterface
    public interface Comparator<T> {
        int compare(T o1, T o2);
    }

    // ToIntBiFunction
    @FunctionalInterface
    public interface ToIntBiFunction<T, U> {
        int applyAsInt(T t, U u);
    }


    public interface ExecutorService extends Executor {
        // Callable<T>와 Runnable을 각각 인수로 받게 Overloading함
        // submit 메서드를 사용할 때마다 형변환이 필요하다
        <T> Future<T> submit(Callback task);
        Future<?> submit(Runnable task);
    }
}
