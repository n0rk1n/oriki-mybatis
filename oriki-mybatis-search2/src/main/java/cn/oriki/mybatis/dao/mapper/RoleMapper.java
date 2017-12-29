package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;

public interface RoleMapper {
    /**
     * 根据id查询角色信息
     *
     * @return
     */
    public Role queryById(Integer id);

    /**
     * 根据id查询用户信息，如果用户可用，查询权限信息，如果用户不可用，不查询权限信息
     *
     * @param id
     * @return
     */
    public Role queryByIdEx(Integer id);

}
