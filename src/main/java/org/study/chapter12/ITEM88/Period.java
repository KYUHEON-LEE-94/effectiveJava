package org.study.chapter12.ITEM88;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * packageName    : org.study.chapter12.ITEM88
 * fileName       : Period
 * author         : LEE KYUHEON
 * date           : 2024-06-29
 * description    : 불변식을 보장하지 못하는 사례
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-29        LEE KYUHEON       최초 생성
 */
public final class Period implements Serializable {

    private Date start;
    private Date end;

    public Period(Date start, Date end) {
        this.start = new Date(start.getTime()); // 방어적 복사
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0) { // 유효성 검사
            throw new IllegalArgumentException(start + " after " + end);
        }
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject(); // 기본 직렬화 수행
        if (start.compareTo(end) > 0) { // 유효성 검사
            throw new InvalidObjectException(start + " 가 " + end + " 보다 늦을 수 없습니다.");
        }
    }
}
