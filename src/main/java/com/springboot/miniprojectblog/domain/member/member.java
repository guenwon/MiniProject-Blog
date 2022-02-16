package com.springboot.miniprojectblog.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor//기본 생성자 자동 추가
@Entity
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNum;

    @Column(length = 10,nullable = false)
    private String name;


    @Column(length = 100, nullable = false)
    private String userId;

    @Builder
    public member(Long userNum, String name, String userId){
        this.userNum = userNum;
        this.name = name;
        this.userId = userId;
    }

}
