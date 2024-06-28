package org.study.chapter12.ITEM87;

import java.io.Serializable;

/**
 * @author : heon
 * @Description : Name.java
 * @since : 2024-06-28
 *
 * <pre>
 * 물리적표현과 논리적 내용이 같은 '이상적인 직렬화 상태'
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-28       heon         최초 생성
 *
 * <pre>
 */
public class Name implements Serializable {

    private String lastName;

    private String firstName;

    private String middleName;
}
