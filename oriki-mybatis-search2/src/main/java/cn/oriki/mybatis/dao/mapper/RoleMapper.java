package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;

public interface RoleMapper {
    /**
     * 根据id查询角色信息
     *
     * @return
     */
    public Role queryById(Integer id);

}
