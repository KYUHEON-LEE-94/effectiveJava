package org.study.chapter10.ITEM77;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author : heon
 * @Description : FileInputStreamEx.java
 * @since : 2024-06-11
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-11       heon         최초 생성
 *
 * <pre>
 */
public class FileInputStreamEx {
    private static final File defaultFile = new File("defaultFilePath");

    public static void main(String[] args) {
        FileInputStreamEx fx = new FileInputStreamEx();

        FileInputStream fileInputStream = fx.openFile();
        close(fileInputStream);
    }

    public FileInputStream openFile() {
        String filePath = (new Scanner(System.in)).nextLine();
        File file = new File(filePath);

        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            return openFile();
        }
    }

    public static void close(FileInputStream fileInputStream) {
        try {
            fileInputStream.close();
        } catch (IOException ignored) {
            // 아래의 이유로 예외를 무시한다.
            ignored.printStackTrace(); // 예외가 주기적으로 발생한다면 조사하기 좋게 로그를 남긴다.
        }
    }
}
