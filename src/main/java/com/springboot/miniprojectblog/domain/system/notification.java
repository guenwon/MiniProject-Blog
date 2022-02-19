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
    @JoinColumn(name = "userNum",insertable=false, updatable=false)
    private member receiver;

    @ManyToOne
    @JoinColumn(name = "userNum",insertable=false, updatable=false)
    private member sender;

    @ManyToOne
    @JoinColumn(name= "notiKind")
    private notificationMessage notiKind;

    @Builder
    public notification(Long notiId, member receiver, member sender, notificationMessage notiKind){
        this.notiId=notiId;
        this.receiver=receiver;
        this.sender=sender;
        this.notiKind=notiKind;
    }


}
