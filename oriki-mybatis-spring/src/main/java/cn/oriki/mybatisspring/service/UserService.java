package cn.oriki.mybatisspring.service;

import cn.oriki.mybatisspring.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> queryAll();
}
