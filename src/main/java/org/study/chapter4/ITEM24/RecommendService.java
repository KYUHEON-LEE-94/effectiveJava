package org.study.chapter4.ITEM24;

/**
 * packageName    : org.study.chapter4.ITEM24
 * fileName       : RecommendService
 * author         : heon
 * date           : 2024-03-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-21           heon               최초 생성
 */
public class RecommendService {
    public String getRecommendId(String new_id) {
        String id = new IdMaker(new_id)
                .replaceToLowerCase()
                .replacePattern()
                .replaceGreaterThan16()
                .getId();

        return id;
    }

    private static class IdMaker {
        private String id;

        IdMaker(String id) {
            this.id = id;
        }

        private IdMaker replaceToLowerCase(){
            id = id.toLowerCase();
            return this;
        }

        private IdMaker replacePattern(){
            id = id.replaceAll("[^a-z0-9]", "");
            return this;
        }

        private IdMaker replaceGreaterThan16(){
            if (id.length() > 15) {
                id = id.substring(0, 15);
            }
            return this;
        }

        private String getId(){
            return id;
        }
    }
}
