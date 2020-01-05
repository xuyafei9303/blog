package com.xyf.blog.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "t_comment")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar; // 头像
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    // 回复的子类对象
    // 被维护
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>();
    // 维护
    @ManyToOne
    private Comment parentComment;

    // 关系维护端
    @ManyToOne
    private Blog blog;

    public Comment() {
    }
}
