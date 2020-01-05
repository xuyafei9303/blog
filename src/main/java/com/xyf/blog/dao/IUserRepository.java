package com.xyf.blog.dao;

import com.xyf.blog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
