package com.springboot.miniprojectblog.domain.blog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBlogRepository extends JpaRepository<UserBlog,Long> {
}
