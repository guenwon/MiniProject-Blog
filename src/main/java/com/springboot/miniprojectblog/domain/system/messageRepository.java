package com.springboot.miniprojectblog.domain.system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface messageRepository extends JpaRepository<message,Long> {
}
