package org.study.chapter4.ITEM20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : org.study.chapter4.ITEM20
 * fileName       : PhoneTest
 * author         : heon
 * date           : 2024-03-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-15           heon               최초 생성
 */
class PhoneTest {

    @Test
    void phoneTest(){
        Phone iPhone = new IPhone();
        Phone galaxyPhone = new GalaxyPhone();
        galaxyPhone.greeting();
        iPhone.greeting();
    }

}