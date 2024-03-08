package org.study.chapter3.ITEM15;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * packageName    : org.study.chapter3.ITEM15
 * fileName       : Post
 * author         : heon
 * date           : 2024-03-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-08           heon               최초 생성
 */
public class Post {
    private final Long seq;
    private final Id<User, Long> userId;
    private String contents;
    private int likes;
    private boolean likesOfMe;
    private int comments;
    private final LocalDateTime createAt;

    public Post(Long seq, Id<User, Long> userId, LocalDateTime createAt) {
        this.seq = seq;
        this.userId = userId;
        this.createAt = createAt;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(seq, post.seq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seq);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("seq", seq)
                .append("userId", userId)
                .append("contents", contents)
                .append("likes", likes)
                .append("likesOfMe", likesOfMe)
                .append("comments", comments)
                .append("createAt", createAt)
                .toString();
    }
}
