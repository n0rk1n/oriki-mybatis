package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据id或者用户名查询
     *
     * @return
     */
    public User queryByIdOrUsername(User user);

    /**
     * 根据用户名和邮箱查找用户
     * 当只输入用户名时，根据用户名模糊查找
     * 当只输入邮箱时，根据邮箱精准查找
     * 既输入用户名又输入邮箱时，使用上述两个条件进行查找
     *
     * @param user
     * @return
     */
    public List<User> queryByUsernameOrEmail(User user);

    /**
     * 根据ids动态查询用户信息
     *
     * @param ids
     * @return
     */
    public List<User> queryUsersByIds(@Param(value = "ids") List<Integer> ids);

    /**
     * 批量添加用户信息
     *
     * @param users
     * @return
     */
    public Integer batchInsertUsers(@Param(value = "users") List<User> users);

    /**
     * 根据map集合更新数据
     *
     * @param map
     * @return
     */
    public Integer updatedByMap(@Param(value = "map") Map<String, String> map);

}
