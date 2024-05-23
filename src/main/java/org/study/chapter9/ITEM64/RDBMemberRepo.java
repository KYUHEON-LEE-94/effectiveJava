package org.study.chapter9.ITEM64;

import org.study.chapter3.equals.Member;

import java.util.Optional;

/**
 * @author : heon
 * @Description : RDBMemberRepo.java
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
public class RDBMemberRepo implements Repository<Member>{
    //TODO DB 커넥션 연결함.
    @Override
    public Member save(Member member) {
        //TODO : DB에 저장 했음
        return new Member();
    }

    @Override
    public Optional<Member> get(Long id) {
        //TODO : DB 검색해서 가져옴
        return Optional.of(new Member());
    }
}
