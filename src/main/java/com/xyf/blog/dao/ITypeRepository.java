package com.xyf.blog.dao;

import com.xyf.blog.pojo.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeRepository extends JpaRepository<Type, Long> {

    Type findByName(String name);
}
