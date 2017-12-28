package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.UserMapper;
import cn.oriki.mybatis.domain.Role;
import cn.oriki.mybatis.domain.User;
import cn.oriki.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<Role> roles = userMapper.queryRolesByUserId(1);

        for (Role role : roles) {
            System.out.println(role);
            User user = role.getUser();
            //获取角色对应用户信息
            System.out.println(role.getUser());
        }

        sqlSession.close();

    }

}
