package com.springboot.miniprojectblog.domain.blog;

import org.springframework.data.repository.CrudRepository;

public interface commentRepository extends CrudRepository<comment,Long> {
}
