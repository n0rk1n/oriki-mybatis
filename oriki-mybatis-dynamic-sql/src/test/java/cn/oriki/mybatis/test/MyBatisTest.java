package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.UserMapper;
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


        User user = new User();
        user.setUsername("admi");// 模糊匹配
        user.setEmail("admin@oriki.cn");

        List<User> users = userMapper.queryUserByUsernameOrEmail(user);

        for (User existUser : users) {
            System.out.println(existUser);
        }

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(1);
        user.setUsername("admin");// 模糊匹配
        user.setEmail("admin@oriki.cn");

        userMapper.updateByIdSelective(user);

        sqlSession.rollback();

        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        User user = new User();
        user.setId(1);
        user.setUsername("admin");

        User existUser = userMapper.queryByIdOrUsername(user);
        System.out.println(existUser);

        sqlSession.close();
    }

}
