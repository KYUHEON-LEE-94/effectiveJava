package org.study.chapter2.equals;

/**
 * packageName    : org.study.equals
 * fileName       : Member
 * author         : LEE KYUHEON
 * date           : 2024-03-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-02        LEE KYUHEON       최초 생성
 */
public class StudyMember2 extends Member {
    private String study;

    public StudyMember2(String email, String name, Integer age, String study) {
        super(email, name, age);
        this.study = study;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Member member = (Member)o;

        return email.equals(member.email) && name.equals(member.name) && age.equals(member.age);
    }
}
