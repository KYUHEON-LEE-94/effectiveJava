package org.study.chapter11.ITEM83;

/**
 * @author : heon
 * @Description : LayInitialization.java
 * @since : 2024-06-24
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-24       heon         최초 생성
 *
 * <pre>
 */
public class LayInitialization {
    private final FieldType field = computeFieldValue();

    private FieldType field;

    private synchronized FieldType getField() {
        if (field == null)
            field = computeFieldValue();
        return field;
    }

    private static class Fieldholder {
        static final FieldType field = computeFieldValue();
    }

    private static FieldType getField() { return FieldHolder.field;}

    /*인스턴스 필드 지연 초기화용 이중검사 관용구*/
    private volatile FieldType field;

    private FieldType getField() {
        FieldType result = field;
        if (result != null) { // 첫 번째 검사 (락 사용 안 함)
            return result;

            synchronized(this) {
                if (field == null) // 두 번째 검사 (락 사용)
                    field = computeFieldValue();
                return field;
            }
        }
}
