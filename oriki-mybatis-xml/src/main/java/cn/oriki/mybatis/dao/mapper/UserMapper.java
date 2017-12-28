package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;
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

    /**
     * 根据用户id查询用户角色信息
     *
     * @param id
     * @return
     */
    public List<Role> queryRolesByUserId(Integer id);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    public Integer saveUser(User user);

    /**
     * 新增用户并返回主键
     *
     * @param user
     * @return
     */
    public Integer saveUserReturnId(User user);

    /**
     * 使用selectKey返回主键
     *
     * @param user
     * @return
     */
    public Integer saveUserReturnIdBySelectKey(User user);

    /**
     * 根据id更新用户
     *
     * @param user
     * @return
     */
    public Integer updateUserById(User user);

}
