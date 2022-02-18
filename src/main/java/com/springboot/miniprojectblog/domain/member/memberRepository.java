package com.springboot.miniprojectblog.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;

public interface memberRepository extends JpaRepository<member, Long> {
}
