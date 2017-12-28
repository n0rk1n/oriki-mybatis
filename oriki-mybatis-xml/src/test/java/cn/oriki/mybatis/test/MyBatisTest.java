package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.UserMapper;
import cn.oriki.mybatis.domain.Role;
import cn.oriki.mybatis.domain.User;
import cn.oriki.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MyBatisTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.queryById(1);

        System.out.println(user);
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.queryAll();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test3() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<Role> roles = userMapper.queryRolesByUserId(1);

        for (Role role : roles) {
            System.out.println(role);
        }

        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(null, "zhangsan", "123456", "abcd@oriki.cn", "描述", new Byte[0], new Date());

        Integer number = userMapper.saveUser(user);

        System.out.println("影响行数：" + number);

        System.out.println("获取用户添加后的主键：" + user.getId());

        //不影响数据库，我们进行回滚
        sqlSession.rollback();
        // 默认SqlSession获取的事务是不自动提交的，我们需要手动提交
        // sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(null, "zhangsan", "123456", "abcd@oriki.cn", "描述", new Byte[0], new Date());

        Integer number = userMapper.saveUserReturnId(user);

        System.out.println("影响行数：" + number);

        System.out.println("获取用户添加后的主键：" + user.getId());

        //不影响数据库，我们进行回滚
        sqlSession.rollback();
        // 默认SqlSession获取的事务是不自动提交的，我们需要手动提交
        // sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test6() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(null, "zhangsan", "123456", "abcd@oriki.cn", "描述", new Byte[0], new Date());

        Integer number = userMapper.saveUserReturnIdBySelectKey(user);

        System.out.println("影响行数：" + number);

        System.out.println("获取用户添加后的主键：" + user.getId());

        //不影响数据库，我们进行回滚
        sqlSession.rollback();
        // 默认SqlSession获取的事务是不自动提交的，我们需要手动提交
        // sqlSession.commit();

        sqlSession.close();
    }
}
