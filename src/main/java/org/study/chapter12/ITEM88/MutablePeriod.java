package org.study.chapter12.ITEM88;

import java.io.*;
import java.util.Date;

/**
 * packageName    : org.study.chapter12.ITEM88
 * fileName       : MutablePeriod
 * author         : LEE KYUHEON
 * date           : 2024-06-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-29        LEE KYUHEON       최초 생성
 */
public class MutablePeriod {
    public final Period period;

    public Date start;

    public Date end;

    public MutablePeriod() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);

            // 불변식을 유지하는 Period 를 직렬화.
            out.writeObject(new Period(new Date(), new Date()));

            /*
             * 악의적인 start, end 로의 참조를 추가.
             */
            byte[] ref = { 0x71, 0, 0x7e, 0, 5 }; // 악의적인 참조
            bos.write(ref); // 시작 필드
            ref[4] = 4; // 악의적인 참조
            bos.write(ref); // 종료 필드

            // 역직렬화 과정에서 Period 객체의 Date 참조를 훔친다.
            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            period = (Period) in.readObject();
            start = (Date) in.readObject();
            end = (Date) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();

        // 방어적 복사를 통해 인스턴스의 필드값 초기화
        start = new Date(start.getTime());
        end = new Date(end.getTime());

        // 유효성 검사
        if (start.compareTo(end) > 0)
            throw new InvalidObjectException(start +" after "+ end);
    }
}
