package com.xyf.blog.vo;

import lombok.Data;

@Data
public class BlogQuery {

    private String title;
    private Long typeId;
    private Boolean recommend = false;

    public BlogQuery() {
    }
}
