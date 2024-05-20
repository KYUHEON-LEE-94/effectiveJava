package org.study.chapter9.ITEM62;

/**
 * @author : heon
 * @Description : StudyInfio.java
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
public class StudyInfo {
    private String team;
    private int itemNum;
    static class compoundKey{
        private String team;
        private int itemNum;

        public compoundKey(String team, int itemNum) {
            this.team = team;
            this.itemNum = itemNum;
        }
        public StudyInfo compound(){
            return new StudyInfo(this);
        }
    }
    private StudyInfo(compoundKey compoundKey){
        team = compoundKey.team;
        itemNum = compoundKey.itemNum;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
}
