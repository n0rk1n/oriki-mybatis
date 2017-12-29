package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     * 根据用户名和邮箱查找用户
     * 当只输入用户名时，根据用户名模糊查找
     * 当只输入邮箱时，根据邮箱精准查找
     * 既输入用户名又输入邮箱时，使用上述两个条件进行查找
     *
     * @param user
     * @return
     */
    public List<User> queryUserByUsernameOrEmail(User user);

    /**
     * 根据id，选择性更新用户信息
     *
     * @param user
     * @return
     */
    public Integer updateByIdSelective(User user);

}
