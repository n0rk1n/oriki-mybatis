package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.CarMapper;
import cn.oriki.mybatis.domain.Car;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    @Test
    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);


        for (int i = 0; i <= 100; i++) {
            carMapper.saveCar(new Car(null, "汽车" + i));
        }

        sqlSession.commit();

        sqlSession.close();

    }
}
