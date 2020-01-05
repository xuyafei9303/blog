package com.xyf.blog.service.impl;

import com.xyf.blog.dao.IUserRepository;
import com.xyf.blog.pojo.User;
import com.xyf.blog.service.IUserService;
import com.xyf.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
    }
}
