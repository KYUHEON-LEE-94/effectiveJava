package org.study.chapter2.dereference;

/**
 * packageName    : org.study.dereference
 * fileName       : test
 * author         : heon
 * date           : 2024-02-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-27           heon               최초 생성
 */
public class Stacktest {
    public static void main(String[] args){

        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
        stack.push(i);
    }

        for (int i = 0; i < 10; i++) {
        stack.pop();
    }

    }
}
