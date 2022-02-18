package com.springboot.miniprojectblog.domain.member;

import com.springboot.miniprojectblog.domain.blog.comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @Enumerated
    private Authority authority;


    public enum Authority{
        ROLE_USER,ROLE_ADMIN
    }


    @OneToMany(mappedBy = "userNum")
    private final Set<comment> comment = new HashSet<>();

    public Set<comment> getComments() {
        Set<comment> comment = this.comment;
        return comment;
    }
}
