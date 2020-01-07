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
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private String content; // 以上注解为大字段注解，懒加载，也可以在数据库中修改为longText类型
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
    @Transient // 不写入数据库
    private String tagIds;
    private String description;

    public void init() {
        this.tagIds = tagsToIds(this.getTags());
    }

    // 1,2,3
    private String tagsToIds(List<Tag> tags) {
        if (!tags.isEmpty()) {
            StringBuffer ids = new StringBuffer();
            boolean flag = false;
            for (Tag tag : tags) {
                if (flag) {
                    ids.append(",");
                } else {
                    flag = true;
                }
                ids.append(tag.getId());
            }
            return ids.toString();
        } else {
            return tagIds;
        }
    }

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
