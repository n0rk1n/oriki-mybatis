package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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

    @Results(value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "name", property = "name"),
            @Result(column = "enabled", property = "enabled"),
            @Result(column = "create_by", property = "createBy"),
            @Result(column = "create_time", property = "createTime")
    })
    @Select(value = {"select id , name , enabled , create_by , create_time from t_role where id = #{id}"})
    public Role queryById2(Integer id);
}
