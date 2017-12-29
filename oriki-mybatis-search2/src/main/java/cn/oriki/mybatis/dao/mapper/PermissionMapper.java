package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Permission;

import java.util.List;

public interface PermissionMapper {
    /**
     * 根据角色id查询角色权限
     *
     * @param roleId
     * @return
     */
    public List<Permission> queryByRoleId(Integer roleId);

}
