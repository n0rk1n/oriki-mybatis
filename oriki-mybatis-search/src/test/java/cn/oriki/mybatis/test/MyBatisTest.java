package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.PersonMapper;
import cn.oriki.mybatis.domain.Person;
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
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        List<Person> people = personMapper.queryAll();

        for (Person person : people) {
            System.out.println(person);
        }

        sqlSession.close();
    }

}
