package com.springboot.miniprojectblog.domain.system;

import com.springboot.miniprojectblog.domain.member.member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notiId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_USER_NUM")
    private member receiverNum;

    @ManyToOne
    @JoinColumn(name = "MEMBER_USER_NUM")
    private member senderNum;

    @ManyToOne
    @JoinColumn(name= "NOTIFICATION_MESSAGE_NOTIKIND")
    private notificationMessage notiKind;

    @Builder
    public notification(Long notiId, member receiverNum, member senderNum, notificationMessage notiKind){
        this.notiId=notiId;
        this.receiverNum=receiverNum;
        this.senderNum=senderNum;
        this.notiKind=notiKind;
    }
}
