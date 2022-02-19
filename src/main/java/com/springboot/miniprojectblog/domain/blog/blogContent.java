package com.springboot.miniprojectblog.domain.blog;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Getter
@NoArgsConstructor
@Entity
public class blogContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contentId;

    @Lob
    @Column(length=100000)
    private byte[] content;

    @CreationTimestamp
    private Date regdate;

    private Long hits;


    @Column(length = 100, nullable = true)
    private String fileName;
    @Column(length = 100, nullable = true)
    private String filePath;


    private Long likes;

    private Long comments;

    @ManyToOne
    @JoinColumn(name = "blogId")
    private userBlog blogId;

    @Builder
    public blogContent(Long contentId,byte[] content, Date date, Long hits,
                       String fileName, String filePath, Long likes,
                       Long comments, userBlog blogId){

        this.contentId = contentId;
        this.regdate = date;
        this.hits = hits;
        this.fileName = fileName;
        this.filePath = filePath;
        this.likes = likes;
        this.comments = comments;
        this.blogId = blogId;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.regdate = date;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public void setBlogId(userBlog blogId) {
        this.blogId = blogId;
    }
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }
}
