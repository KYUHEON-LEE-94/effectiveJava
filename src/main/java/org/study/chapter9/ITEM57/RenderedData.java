package org.study.chapter9.ITEM57;

import javax.swing.text.ParagraphView;

/**
 * @author : heon
 * @Description : RenderedData.java
 * @since : 2024-05-13
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-13       heon         최초 생성
 *
 * <pre>
 */
public class RenderedData {
    private String myData;

    public RenderedData(String myData) {
        this.myData = myData;
    }

    public String render(){
        return this.myData;
    }
    public boolean getRendingComplete(){
        return true;
    }

    public void cleanup(){ this.myData="";}
}
