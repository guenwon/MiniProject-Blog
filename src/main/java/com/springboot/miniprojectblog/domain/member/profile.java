package com.springboot.miniprojectblog.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity
public class profile implements Serializable {



    @Id
    @OneToOne
    @JoinColumn(name = "user_num",insertable=false, updatable=false)
    private member member;

            @Column(nullable = false,length = 100)
    private String userName;

            @Column( length = 100)
    private String imageName;

            @Column( length = 100)
    private String imagePath;

            @Lob
    private String selfIntro;

            @Builder
    public profile (member member, String userName, String imageName, String imagePath, String selfIntro){
                this.member = member;
                this.userName = userName;
                this.imageName = imageName;
                this.imagePath = imagePath;
                this.selfIntro = selfIntro;
            }
}
