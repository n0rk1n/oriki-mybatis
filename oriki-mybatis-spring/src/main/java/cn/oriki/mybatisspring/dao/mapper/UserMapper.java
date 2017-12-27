package cn.oriki.mybatisspring.dao.mapper;

import cn.oriki.mybatisspring.domain.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有
     *
     * @return
     */
    List<User> queryAll();
}
