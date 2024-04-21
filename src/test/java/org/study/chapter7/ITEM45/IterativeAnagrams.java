package org.study.chapter7.ITEM45;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

/**
 * packageName    : org.study.chapter7.ITEM45
 * fileName       : IterativeAnagrams
 * author         : LEE KYUHEON
 * date           : 2024-04-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-21        LEE KYUHEON       최초 생성
 */
public class IterativeAnagrams {

    @Test
    void test() throws IOException {
        Path dictionary = Paths.get(System.getProperty("user.home"));
        int minGroupSize = Integer.parseInt("1");

        try (Stream<String> words = Files.lines(dictionary)) {
            words.collect(groupingBy(word -> alphabetize(word)))
                    .values().stream()
                    .filter(group -> group.size() >= minGroupSize)
                    .forEach(group -> System.out.println(group.size() + ": " + group));
        }
    }

    private static String alphabetize(String s) {
        /*char는 stream 지원을 하지 않고 있다.*/
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
