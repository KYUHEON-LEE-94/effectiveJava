package org.study.chapter12.ITEM87;

import java.io.IOException;
import java.io.Serializable;

/**
 * @author : heon
 * @Description : SomeClass.java
 * @since : 2024-06-28
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-06-28       heon         최초 생성
 *
 * <pre>
 */
public class SomeClass implements Serializable {
    private String fld1;
    private int fld2;
    private transient String fld3;

    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject(); //fills fld1 and fld2;
        fld3 = Configuration.getFooConfigValue();
    }
}

