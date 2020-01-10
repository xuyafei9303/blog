package com.xyf.blog.service;

import com.xyf.blog.pojo.Comment;

import java.util.List;

public interface ICommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
