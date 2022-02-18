package com.springboot.miniprojectblog.domain.blog;

import com.springboot.miniprojectblog.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
public class UserBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blogId;

    @OneToOne
    @JoinColumn(name = "user_num")
    private Member member;

    @Column(length = 100, nullable = false)
    private String category;

    @Builder
    public UserBlog(Long blogId, Member member, String category){
        this.blogId = blogId;
        this.member = member;
        this.category = category;
    }
}
