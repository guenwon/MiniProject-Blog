package com.springboot.miniprojectblog.domain.blog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userBlogRepository extends JpaRepository<userBlog,Long> {
}
