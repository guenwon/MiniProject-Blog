package com.springboot.miniprojectblog.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
public class Profile {

    @OneToOne
    @JoinColumn(name = "user_num")
    private Member member;

    @Column(nullable = false,length = 100)
    private String userName;

    @Column( length = 100)
    private String imageName;

    @Column( length = 100)
    private String imagePath;

    @Lob
    private String selfIntro;

    @Builder
    public Profile (Member member, String userName, String imageName, String imagePath, String selfIntro){
        this.member = member;
        this.userName = userName;
        this.imageName = imageName;
        this.imagePath = imagePath;
        this.selfIntro = selfIntro;
    }
}