package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;

import java.util.List;

public interface UserMapper {
    /**
     * 根据用户id查询当前用户角色信息
     *
     * @param id
     * @return
     */
    public List<Role> queryRolesByUserId(Integer id);
}
