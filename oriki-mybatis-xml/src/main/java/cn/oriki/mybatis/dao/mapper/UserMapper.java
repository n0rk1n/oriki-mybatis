package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    public User queryById(Integer id);

    /**
     * 查询所有用户的方法
     *
     * @return  
     */
    public List<User> queryAll();
}
