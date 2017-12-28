package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.UserMapper;
import cn.oriki.mybatis.domain.User;
import cn.oriki.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyBatisTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.queryById(1);

        System.out.println(user);
    }
}
