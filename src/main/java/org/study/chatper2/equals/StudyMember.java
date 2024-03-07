package org.study.chatper2.equals;

/**
 * packageName    : org.study.equals
 * fileName       : StudyMember
 * author         : LEE KYUHEON
 * date           : 2024-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-02        LEE KYUHEON       최초 생성
 */
public class StudyMember extends Member {
    private String study;

    public StudyMember(String email, String name, Integer age, String study) {
        super(email, name, age);
        this.study = study;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof StudyMember)) {
            return false;
        }

        return super.equals(o) && ((StudyMember)o).study.equals(study);
    }
}
