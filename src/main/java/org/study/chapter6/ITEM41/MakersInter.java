package org.study.chapter6.ITEM41;

import java.io.*;

/**
 * packageName    : org.study.chapter6.ITEM41
 * fileName       : MakersInter
 * author         : heon
 * date           : 2024-04-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-15           heon               최초 생성
 */
public class MakersInter {
    public static void newWriteObject(Object object, String path) {
        File file = new File(path);

        try (ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream(file))) {
            oops.writeObject(object);
        } catch (IOException e) {
            System.out.println("런타임에 에러 발생");
        }
    }
}
