package org.study.chapter9.ITEM57;


/**
 * @author : heon
 * @Description : MyData.java
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
public class MyData {
    public void process() {
        // 데이터를 읽어오는 로직
        String myData = DataSource.readData();

        // 데이터를 파싱하는 로직
        RenderedData renderedData = parseData(myData);
        renderedData.render();

        // 데이터를 정리하는 로직
        if (renderedData.getRendingComplete()) {
            renderedData.cleanup();
        }
    }

    public RenderedData parseData(String myData){
        return new RenderedData(myData);
    }
}
