package com.xyf.blog.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views; // 浏览次数
    private boolean appreciation; // 赞赏是否开启
    private boolean shareStatement; // 转载声明是否开启
    private boolean commentEnabled; // 评论是否开启
    private boolean published; // 是否发布
    private boolean recommend; // 是否推荐
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    // 关系维护端
    @ManyToOne
    private Type type;

    // 关系维护端
    @ManyToMany(cascade = {CascadeType.PERSIST}) // 级联新增
    private List<Tag> tags = new ArrayList<>();

    // 关系维护端
    @ManyToOne
    private User user;

    // 关系被维护端
    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

    public Blog() {
    }
}
