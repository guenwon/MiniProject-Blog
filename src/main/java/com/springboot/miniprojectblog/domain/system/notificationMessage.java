package com.springboot.miniprojectblog.domain.system;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class notificationMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notiKind;

    @Column(length = 255,nullable = false)
    private String notiMessage;

    @Builder
    public notificationMessage(Long notiKind, String notiMessage){
        this.notiKind=notiKind;
        this.notiMessage=notiMessage;
    }

    public void setNotiKind(Long notiKind) {
        this.notiKind = notiKind;
    }

    public void setNotiMessage(String notiMessage) {
        this.notiMessage = notiMessage;
    }
}
