package com.springboot.miniprojectblog.domain.blog;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import com.springboot.miniprojectblog.domain.member.member;
import javax.persistence.*;


@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
public class userBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blogId;

    @OneToOne
    @JoinColumn(name = "user_num",insertable=false, updatable=false)
    private member member;

    @Column(length = 100, nullable = false)
    private String category;

    @Builder
    public userBlog(Long blogId, member member, String category){
                this.blogId = blogId;
                this.member = member;
                this.category = category;
    }
}