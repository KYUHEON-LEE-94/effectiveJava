package org.study.chapter2.tryWithResources;

import java.io.IOException;

/**
 * packageName    : org.study.tryWithResources
 * fileName       : ExampTest
 * author         : heon
 * date           : 2024-02-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-29           heon               최초 생성
 */
public class ExamTest {
    public static void main(String[] args) {
        try {
            writeData("Write this !");
            writeData2("Write2 this !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeData(String writeString) throws IOException {
        TestFileOutputStream ts = new TestFileOutputStream();
        try {
            ts.write(writeString, true);
        } finally {
            ts.close();
        }
    }

    public static void writeData2(String writeString) throws IOException {
        TestFileOutputStream ts = new TestFileOutputStream();
        try {
            TestFileOutputStream ts2 = new TestFileOutputStream();
            try {
                ts.write(writeString, true);
                ts2.write(writeString, true);
            } finally {
                ts2.close();
            }
        } finally {
            ts.close();
        }
    }
}
