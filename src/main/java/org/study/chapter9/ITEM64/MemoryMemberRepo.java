package org.study.chapter9.ITEM64;

import org.study.chapter3.equals.Member;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author : heon
 * @Description : MemoryMemberRepo.java
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
public class MemoryMemberRepo implements Repository<Member>{
    private static final HashMap<Long ,Member> memoryDB = new HashMap<>();
    private static Long key = 1L;

    @Override
    public Member save(Member member) {
        memoryDB.put(key,member);
        key++;
        return member;
    }

    @Override
    public Optional<Member> get(Long id) {
        if(memoryDB.containsKey(key)){
            return Optional.of(memoryDB.get(key));
        }
        return Optional.empty();
    }
}
