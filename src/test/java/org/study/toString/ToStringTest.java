package org.study.toString;

import org.junit.jupiter.api.*;
import org.study.chapter2.toString.PhoneNumberByDefault;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

/**
 * packageName    : org.study.toString
 * fileName       : ToStringTest
 * author         : heon
 * date           : 2024-03-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-05           heon               최초 생성
 */
public class ToStringTest {
    // Object 클래스의 toString 메서드를 호출했을 때
    private static final Pattern OBJECT_PATTERN = Pattern.compile("(.+)-(.+)-(.+)");

    // 이 객체는 System.out의 출력을 캡처하여 저장할 수 있는 메모리 버퍼입니다.
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @DisplayName("System.out.println 메서드에서 객체 호출")
    @Test
    void callToString_Println() {
        PhoneNumberByDefault phoneNumber = new PhoneNumberByDefault(010, 1234, 1234);
        System.out.println(phoneNumber);
        Assertions.assertTrue(OBJECT_PATTERN.matcher(outContent.toString()).find());
    }
}
