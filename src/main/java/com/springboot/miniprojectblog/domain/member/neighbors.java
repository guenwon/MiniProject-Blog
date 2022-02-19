package com.springboot.miniprojectblog.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor//기본 생성자 자동 추가
@Entity
public class neighbors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long neighborId;

    @ManyToOne
    @JoinColumn(name="userNum",insertable=false, updatable=false)
    private member home;

    @ManyToOne
    @JoinColumn(name="userNum",insertable=false, updatable=false)
    private member neighbor;

    @Builder
    public neighbors(Long neighborId, member home, member neighbor){
        this.neighborId = neighborId;
        this.home = home;
        this.neighbor = neighbor;
    }

    public void setNeighborId(Long neighborId) {
        this.neighborId = neighborId;
    }

    public void setHome(member home) {
        this.home = home;
    }

    public void setNeighbor(member neighbor) {
        this.neighbor = neighbor;
    }
}
