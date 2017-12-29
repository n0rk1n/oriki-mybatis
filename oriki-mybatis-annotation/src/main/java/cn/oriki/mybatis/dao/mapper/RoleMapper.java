package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleMapper {
    /**
     * 根据id查询角色信息
     *
     * @param id
     * @return
     */
    @Select(value = {"select r.id as id , r.name as name , r.enabled as enable , r.create_by as createBy , r.create_time as createTime from t_role r where id = #{id}"})
    public Role queryById(Integer id);

    @Results(id = "roleMap", value = {
            @Result(column = "id", property = "id", id = true),
            @Result(column = "name", property = "name"),
            @Result(column = "enabled", property = "enabled"),
            @Result(column = "create_by", property = "createBy"),
            @Result(column = "create_time", property = "createTime")
    })
    @Select(value = {"select id , name , enabled , create_by , create_time from t_role where id = #{id}"})
    public Role queryById2(Integer id);

    /**
     * 查询所有角色的方法
     *
     * @return
     */
    @ResultMap(value = "roleMap")
    @Select(value = {"select id , name , enabled , create_by , create_time from t_role "})
    public List<Role> queryAll();

    /**
     * 保存角色
     *
     * @param role
     * @return
     */
    @Insert(value = "insert into t_role values (null , #{name} , #{enabled} , #{createBy} , now());")
    public Integer saveRole(Role role);

    /**
     * 保存角色并返回主键
     *
     * @param role
     * @return
     */
    @Insert(value = "insert into t_role values (null , #{name} , #{enabled} , #{createBy} , now());")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public Integer saveRoleReturnKey(Role role);

    /**
     * 保存角色并返回主键
     *
     * @param role
     * @return
     */
    @Insert(value = "insert into t_role values (null , #{name} , #{enabled} , #{createBy} , now());")
    @SelectKey(statement = "select last_insert_id();", keyProperty = "id", keyColumn = "id", before = false, resultType = Integer.class)
    public Integer saveRoleReturnKeyBySelectKey(Role role);

}
