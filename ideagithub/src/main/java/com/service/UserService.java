package com.service;

import com.green.User;

import java.util.List;

/**
 * @author 向杨
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAllUser();
}
