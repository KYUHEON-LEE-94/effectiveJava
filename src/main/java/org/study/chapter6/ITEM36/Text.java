package org.study.chapter6.ITEM36;

import java.util.EnumSet;
import java.util.Set;

/**
 * packageName    : org.study.chapter6.ITEM36
 * fileName       : Text
 * author         : heon
 * date           : 2024-04-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04           heon               최초 생성
 */
public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    public static void applyStyles(Set<Style> styles) {
        //...
    }

    public static void main(String[] args) {
        // ...
        Text text = null;
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC, Style.UNDERLINE));
    }
}
