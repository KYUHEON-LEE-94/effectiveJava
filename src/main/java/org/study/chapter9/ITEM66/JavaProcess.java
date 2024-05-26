package org.study.chapter9.ITEM66;

/**
 * packageName    : org.study.chapter9.ITEM66
 * fileName       : JavaProcess
 * author         : LEE KYUHEON
 * date           : 2024-05-26
 * description    : JNI 간단 예시
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-26        LEE KYUHEON       최초 생성
 */
public class JavaProcess {
    public static void printProcessInfo(){
        ProcessHandle processHandle = ProcessHandle.current();
        ProcessHandle.Info processInfo = processHandle.info();

        System.out.println("processHandle.pid(): " + processHandle.pid());
        System.out.println("processInfo.arguments(): " + processInfo.arguments());
        System.out.println("processInfo.command(): " + processInfo.command());
        System.out.println("processInfo.startInstant(): " + processInfo.startInstant());
        System.out.println("processInfo.user(): " + processInfo.user());
    }
    public static void main(String[] args) {
        printProcessInfo();
    }
}
