package com.jinhaima.service;

import com.jinhaima.entity.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
