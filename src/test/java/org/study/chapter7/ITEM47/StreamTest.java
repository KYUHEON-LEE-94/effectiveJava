package org.study.chapter7.ITEM47;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * packageName    : org.study.chapter7.ITEM47
 * fileName       : StreamTest
 * author         : heon
 * date           : 2024-04-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-23           heon               최초 생성
 */
public class StreamTest {
    @Test
    void foreach_iterable() {
        // given
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // when & then
        for (int number: numbers) {
            assertEquals(number <= 3,true);
        }
    }

    @Test
    void foreach_stream() {
        // given
        Stream<Integer> numberStream = Stream.of(1, 2, 3);

        // when
        for (int number: (Iterable<Integer>) numberStream::iterator) {
            assertEquals(number <= 3,true);
        }
    }

    @Test
    void foreach_stream2() {
        // given
        Stream<Integer> numberStream = Stream.of(1, 2, 3);

        // when
        for (int number: getIterable(numberStream)) {
            assertEquals(number <= 3,true);
        }
    }

    private static <T> Iterable<T> getIterable(Stream<T> stream) {
        return stream::iterator;
    }

    @Test
    void foreach_stream3() {
        // given
        Stream<Integer> numberStream = Stream.of(1, 2, 3);

        // when
        for (int number: (Iterable<Integer>) () -> numberStream.iterator()) {
            assertEquals(number <= 3,true);
        }
    }

    @Test
    void iterable_to_stream(){
        // given
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        // when
        Stream<Integer> numberStream = getStream(numbers);

        // then
        numberStream.forEach(number -> assertEquals(number <= 3,true));
    }

    private static <T> Stream<T> getStream(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
