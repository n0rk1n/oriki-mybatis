package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {
    /**
     * 根据id查询角色信息
     *
     * @param id
     * @return
     */
    @Select(value = {"select r.id as id , r.name as name , r.enabled as enable , r.create_by as createBy , r.create_time as createTime from t_role r where id = #{id}"})
    public Role queryById(Integer id);

}
