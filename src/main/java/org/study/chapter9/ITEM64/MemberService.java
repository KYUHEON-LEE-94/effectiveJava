package org.study.chapter9.ITEM64;

import org.study.chapter3.equals.Member;

/**
 * @author : heon
 * @Description : MemberService.java
 * @since : 2024-05-23
 *
 * <pre>
 *
 * << 개정이력(Modification Information) >>
 *
 * ===========================================================
 * 수정인          수정자      수정내용
 * ----------    ----------    --------------------
 * 2024-05-23       heon         최초 생성
 *
 * <pre>
 */
public class MemberService {
    private final Repository<Member> repo;

    public MemberService(Repository<Member> repo) {
        this.repo = repo;
    }
}
