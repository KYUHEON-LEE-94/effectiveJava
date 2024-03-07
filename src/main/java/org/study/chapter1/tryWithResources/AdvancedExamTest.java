package org.study.chapter1.tryWithResources;

import java.io.IOException;

/**
 * packageName    : org.study.tryWithResources
 * fileName       : AdvancedExamTest
 * author         : heon
 * date           : 2024-02-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-29           heon               최초 생성
 */
public class AdvancedExamTest {
    public class Main {
        public static void main(String[] args) {

            try {
                writeData("Write this !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void writeData(String writeString) throws IOException {
            try(FileOutputStreamForAutoCloseable ts = new FileOutputStreamForAutoCloseable()){
                ts.write(writeString, true);
            }
        }
        public static void writeData2(String writeString) throws IOException {
            try (FileOutputStreamForAutoCloseable ts = new FileOutputStreamForAutoCloseable();
                 FileOutputStreamForAutoCloseable ts2 = new FileOutputStreamForAutoCloseable()) {
                ts.write(writeString, true);
                ts2.write(writeString, true);
            }
        }
    }

}
