package org.study.chapter1.tryWithResources;

import java.io.IOException;

/**
 * packageName    : org.study.tryWithResources
 * fileName       : TestFileOutputStream
 * author         : heon
 * date           : 2024-02-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-29           heon               최초 생성
 */
public class TestFileOutputStream {
    public void write(String writeData, boolean throwException) throws IOException {
        System.out.println("WRITING .... : " + writeData);
        if (throwException)
            throw new IOException("[TestFileOutputStream readLine method] EXCEPTION !");
    }

    public void close() throws IOException {
        throw new IOException("[TestFileOutputStream close method] EXCEPTION");
    }
}
