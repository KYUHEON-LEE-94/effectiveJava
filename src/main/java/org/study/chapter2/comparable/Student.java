package org.study.chapter2.comparable;

/**
 * packageName    : org.study.chatper2.comparable
 * fileName       : Student
 * author         : heon
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07           heon               최초 생성
 */
public class Student implements  Comparable<Student>{
    String studentName; // 이름
    int studentId;      // 학번
    double score;       // 학점

    public Student(String studentName, int studentId, double score) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름: " + studentName + ", 학번: " + studentId + ", 학점: " + score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.studentId);
    }
}
