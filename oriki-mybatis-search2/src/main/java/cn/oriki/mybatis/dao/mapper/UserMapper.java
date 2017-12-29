package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.User;

public interface UserMapper {

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public User queryById(Integer id);
}
