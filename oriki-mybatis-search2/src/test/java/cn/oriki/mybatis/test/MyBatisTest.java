package cn.oriki.mybatis.test;


import cn.oriki.mybatis.dao.mapper.RoleMapper;
import cn.oriki.mybatis.dao.mapper.UserMapper;
import cn.oriki.mybatis.domain.Permission;
import cn.oriki.mybatis.domain.Role;
import cn.oriki.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.queryById(1);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.queryWithRoleById(1);
        List<Role> roles = user.getRoles();

        System.out.println(user);

        for (Role role : roles) {
            System.out.println(role);
        }

        sqlSession.close();
    }

    @Test
    public void test3() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

        Role role = roleMapper.queryById(1);

        System.out.println(role);

        List<Permission> permissions = role.getPermissions();

        for (Permission permission : permissions) {
            System.out.println(permission);
        }


        sqlSession.close();
    }

    @Test
    public void test4() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

        Role role = roleMapper.queryByIdEx(1);

        System.out.println(role);

        List<Permission> permissions = role.getPermissions();

        if (permissions != null) {
            for (Permission permission : permissions) {
                System.out.println(permission);
            }
        }


        sqlSession.close();
    }


}
