package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.UserMapper;
import cn.oriki.mybatis.domain.User;
import cn.oriki.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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

    @Test
    public void test4() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        User user = new User();
        user.setUsername("admi");
        user.setEmail("admin@oriki.cn");

        List<User> users = userMapper.queryByUsernameOrEmail(user);
        for (User existUser : users) {
            System.out.println(existUser);
        }

        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);

        List<User> users = userMapper.queryUsersByIds(ids);
        for (User existUser : users) {
            System.out.println(existUser);
        }

        sqlSession.close();
    }

    @Test
    public void test6() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(null, "zhangsan", "123456", "zhangsan@oriki.cn", "描述", new Byte[0], null));
        users.add(new User(null, "lisi", "123456", "lisi@oriki.cn", "描述", new Byte[0], null));

        userMapper.batchInsertUsers(users);


        sqlSession.close();
    }

    @Test
    public void test7() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, String> map = new HashMap<>();

        map.put("id", Integer.valueOf(1).toString());
        map.put("username", "zhangsan");

        userMapper.updatedByMap(map);

        sqlSession.rollback();

        sqlSession.close();
    }

}
