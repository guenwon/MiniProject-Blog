package com.springboot.miniprojectblog.domain.blog;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

import com.springboot.miniprojectblog.domain.member.member;

@Getter
@NoArgsConstructor //기본 생성자 자동 추가
@Entity
public class scrapContents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scrapId;

            @ManyToOne
    @JoinColumn(name = "content_id")
    private blogContent blogContent;

            @ManyToOne
    @JoinColumn(name = "user_num")
    private member member;

            @Builder
    public scrapContents(Long scrapId, blogContent blogContent, member member){
                this.scrapId = scrapId;
                this.blogContent = blogContent;
                this.member = member;
            }
}
