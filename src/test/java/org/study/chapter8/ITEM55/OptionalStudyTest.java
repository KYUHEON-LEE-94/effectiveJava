package org.study.chapter8.ITEM55;

import org.junit.jupiter.api.Test;

import javax.lang.model.util.Elements;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : heon
 * @Description : OptionalStudyTest.java
 * @since : 2024-05-09
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-09       heon         최초 생성
 *
 * <pre>
 */
class OptionalStudyTest {

    @Test
    void 기본값을_정한다(){
        List<String> words = new ArrayList<>();
        words.add("사과");

        String lastWordInLexicon = OptionalStudy.max2(words).orElse("단어 없음");
        assertNotEquals(lastWordInLexicon, "단어 없음");
    }

    @Test
    void 원하는_예외_던질수있다(){
        List<String> toys = new ArrayList<>();

        OptionalStudy.max2(toys).orElseThrow(RuntimeException::new);
    }

    @Test
    void 항상값이_있다고_가정할수있다(){
        List<String> elements = new ArrayList<>();
        elements.add("test");

        String lastNobleGas = OptionalStudy.max2(elements).get();
    }

    @Test
    void 기본값_설정비용이_클경우(){
        Optional.of("baeldung").orElse(getRandomName());

        // Supplier<T>를 인수로 받는 orElseGet을 사용하면 초기 설정 비용을 낮출 수 있다.
        Optional.of("baeldung").orElseGet(() -> getRandomName());
    }

    public String getRandomName(){
        return "random";
    }

    @Test
    void isPresent_메서드(){
        ProcessHandle ph = ProcessHandle.current();

        // Inappropriate use of isPresent
        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("Parent PID: " + (parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A"));

        // Equivalent (and superior) code using orElse
        System.out.println("Parent PID: " + ph.parent().map(h -> String.valueOf(h.pid())).orElse("N/A"));
    }

    @Test
    void 스트림사용하는경우(){
        List<Optional>  streamOfOptionals = new ArrayList<>();
        streamOfOptionals.add(Optional.of("Test"));

        streamOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get);
    }

    @Test
    void 옵셔널타입들(){
        OptionalDouble.of(123);
        OptionalInt.of(1);
        OptionalLong.of(1L);
    }
}