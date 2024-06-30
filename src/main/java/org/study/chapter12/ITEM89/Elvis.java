package org.study.chapter12.ITEM89;

import java.io.Serializable;
import java.util.Arrays;

/**
 * packageName    : org.study.chapter12.ITEM89
 * fileName       : Elvis
 * author         : LEE KYUHEON
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        LEE KYUHEON       최초 생성
 */
public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    private String[] favoriteSongs = {"Hound Dog", "Heartbreak Hotel"};

    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
