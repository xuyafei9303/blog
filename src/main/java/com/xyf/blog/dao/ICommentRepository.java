package com.xyf.blog.dao;

import com.xyf.blog.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogIdAndParentCommentIsNull(Long blogId, Sort sort);
}
