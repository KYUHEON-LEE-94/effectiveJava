package org.study.chatper2.toString;

/**
 * packageName    : org.study.toString
 * fileName       : PhoneNumberByDefault
 * author         : heon
 * date           : 2024-03-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-05           heon               최초 생성
 */
public class PhoneNumberByDefault {
    private int areaCode;
    private int prefix;
    private int lineNum;

    public PhoneNumberByDefault(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return String.format("%03d-%04d-%04d", areaCode, prefix, lineNum);
    }
}
