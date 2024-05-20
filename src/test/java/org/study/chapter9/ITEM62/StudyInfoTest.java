package org.study.chapter9.ITEM62;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : heon
 * @Description : StudyInfoTest.java
 * @since : 2024-05-20
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-20       heon         최초 생성
 *
 * <pre>
 */
class StudyInfoTest {
    @Test
    void test(){
        ArrayList<Integer> itemList = new ArrayList<>(List.of(60,61,62));
        Iterator<Integer> i = itemList.iterator();

        StudyInfo student1 = new StudyInfo.compoundKey("B팀",i.next()).compound();
        StudyInfo student2 = new StudyInfo.compoundKey("A팀",i.next()).compound();
        StudyInfo student3 = new StudyInfo.compoundKey("B팀",i.next()).compound();

        System.out.println("student1: " + student1.getTeam() + " 아이템 " + student1.getItemNum());
        System.out.println("student2: " + student2.getTeam() + " 아이템 " + student2.getItemNum());
        System.out.println("student3: " + student3.getTeam() + " 아이템 " + student3.getItemNum());
    }

}