package org.study.chapter10.ITEM74;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author : heon
 * @Description : Exam.java
 * @since : 2024-06-05
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-05       heon         최초 생성
 *
 * <pre>
 */
/**
 * <p> {@code NullPointerException} 지정한 요소에 null 이 들어오는 경우 발생합니다.</p>
 */
public class Exam {
    /**
     * @throws SQLException SQL 이 잘못된 경우
     * @throws ClassNotFoundException 지정한 경로에 클래스파일이 존재하지 않는경우.
     * @throws NullPointerException 지정한 요소에 null 이 들어오는 경우
     */
    public void examMethod() throws SQLException,ClassNotFoundException{
        Class.forName("asd");
        // TODO 무언가 했음.
    }

    /**
     * @throws NullPointerException 지정한 요소에 null 이 들어오는 경우
     */
    public void examMethod2() throws IOException {
        //TODO 일하는 중
    }
}
