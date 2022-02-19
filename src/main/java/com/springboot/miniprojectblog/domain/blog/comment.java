package com.springboot.miniprojectblog.domain.blog;

import com.springboot.miniprojectblog.domain.member.member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne
    @JoinColumn(name="contentId")
    private blogContent contentId;

    @ManyToOne
    @JoinColumn(name="userNum",insertable=false, updatable=false)//PK foreign key로 참조시 체크 필요
    private member userNum;


    private Long parent;
    private Long depth;
    private Long seq;

    @Column(length = 100, nullable = true)
    private String fileName;
    @Column(length = 100, nullable = true)
    private String filePath;


    private Boolean secret;

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public void setContentId(blogContent contentId) {
        this.contentId = contentId;
    }

    public void setUserNum(member userNum) {
        this.userNum = userNum;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setDepth(Long depth) {
        this.depth = depth;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setSecret(Boolean secret) {
        this.secret = secret;
    }

    @Builder
    public comment(
        Long commentId, blogContent contentId, member userNum, Long parent, Long depth,
        Long seq, String fileName, String filePath, Boolean secret){
        this.commentId = commentId;
        this.contentId = contentId;
        this.userNum = userNum;
        this.parent = parent;
        this.depth = depth;
        this.seq = seq;
        this.fileName = fileName;
        this.filePath = filePath;
        this.secret = secret;

    }


}
