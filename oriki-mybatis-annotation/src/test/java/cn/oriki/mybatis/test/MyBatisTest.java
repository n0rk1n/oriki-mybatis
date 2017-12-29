package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.RoleMapper;
import cn.oriki.mybatis.domain.Role;
import cn.oriki.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {

    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

        Role role = roleMapper.queryById(1);

        System.out.println(role);

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

        Role role = roleMapper.queryById2(1);

        System.out.println(role);

        sqlSession.close();
    }
}
