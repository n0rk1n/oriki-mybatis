package cn.oriki.mybatis.test;


import cn.oriki.mybatis.domain.Country;
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
        inputStream.close();

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Country> lists = sqlSession.selectList("countryMapper.queryAll");

        for (Country country : lists) {
            System.out.println(country.toString());
        }

        sqlSession.close();
    }
}
