package com.xyf.blog.service;

import com.xyf.blog.pojo.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ITypeService {
    /**
     * 新增
     * @param type
     * @return
     */
    Type saveType(Type type);

    /**
     * 查询
     * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 修改
     * @param id
     * @param type
     * @return
     */
    Type updateType(Long id, Type type);

    /**
     * 删除
     * @param id
     */
    void deleteType(Long id);

    Type getTypeByName(String name);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);
}
