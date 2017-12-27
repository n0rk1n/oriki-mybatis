package cn.oriki.mybatisspring.service.impl;

import cn.oriki.mybatisspring.dao.mapper.UserMapper;
import cn.oriki.mybatisspring.domain.User;
import cn.oriki.mybatisspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
