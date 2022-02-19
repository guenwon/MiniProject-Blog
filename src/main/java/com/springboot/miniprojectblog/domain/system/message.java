package com.springboot.miniprojectblog.domain.system;

import com.springboot.miniprojectblog.domain.member.member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    @ManyToOne
    @JoinColumn(name = "userNum",insertable=false, updatable=false)
    private member sender;

    @ManyToOne
    @JoinColumn(name = "userNum",insertable=false, updatable=false)
    private member receiver;

    @Column(length = 50000, nullable = false)
    private String message;

    @Builder
    public message(Long messageId, member sender, member receiver, String message){
        this.messageId=messageId;
        this.sender=sender;
        this.receiver=receiver;
        this.message=message;
    }
}
