package com.xyf.blog.dao;

import com.xyf.blog.pojo.Tag;
import com.xyf.blog.pojo.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITagRepository extends JpaRepository<Tag, Long> {

    Tag findByName(String name);
}
