package com.springboot.miniprojectblog.domain.blog;

import com.springboot.miniprojectblog.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본 생성자 자동 추가
@Entity
public class ScrapContents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scrapId;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private BlogContent blogContent;

    @ManyToOne
    @JoinColumn(name = "user_num")
    private Member member;

    @Builder
    public ScrapContents(Long scrapId, BlogContent blogContent, Member member){
        this.scrapId = scrapId;
        this.blogContent = blogContent;
        this.member = member;
    }
}
