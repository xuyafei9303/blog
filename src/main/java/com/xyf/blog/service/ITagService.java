package com.xyf.blog.service;

import com.xyf.blog.pojo.Tag;
import com.xyf.blog.pojo.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITagService {

    /**
     * 新增
     * @param tag
     * @return
     */
    Tag saveTag(Tag tag);

    /**
     * 查询
     * @param id
     * @return
     */
    Tag getTag(Long id);

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Tag> listTag(Pageable pageable);

    /**
     * 修改
     * @param id
     * @param tag
     * @return
     */
    Tag updateTag(Long id, Tag tag);

    /**
     * 删除
     * @param id
     */
    void deleteTag(Long id);

    Tag getTagByName(String name);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);
}
