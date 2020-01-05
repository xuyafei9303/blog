package com.xyf.blog.service;

import com.xyf.blog.pojo.User;

public interface IUserService {

    User checkUser(String username, String password);
}
