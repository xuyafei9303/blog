package com.xyf.blog.service;

import com.xyf.blog.pojo.Blog;
import com.xyf.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    /**
     * 查询
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     * 分页查询blog
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    /**
     * 新增
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 修改
     * @param id
     * @return
     */
    Blog updateBlog(Long id, Blog blog);

    /**
     * 删除
     * @param id
     */
    void deleteBlog(Long id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(String query, Pageable pageable);

    List<Blog> listRecommendBlogTop(Integer size);
}
