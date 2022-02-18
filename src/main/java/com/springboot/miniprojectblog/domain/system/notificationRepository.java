package com.springboot.miniprojectblog.domain.system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface notificationRepository extends JpaRepository<notification, Long> {
}
