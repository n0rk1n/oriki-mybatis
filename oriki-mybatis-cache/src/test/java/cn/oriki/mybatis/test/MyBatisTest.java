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

        List<Country> lists2 = sqlSession.selectList("countryMapper.queryAll");

        for (Country country : lists2) {
            System.out.println(country.toString());
        }

        sqlSession.close();
    }
//    DEBUG[main]-Created connection 1780132728.
//    DEBUG[main]-Setting autocommit to false on JDBC Connection [com.mysql.jdbc.JDBC4Connection@6a1aab78]
//    DEBUG[main]-==>  Preparing: select * from t_country;
//    DEBUG[main]-==> Parameters:
//    DEBUG[main]-<==      Total: 4
//    Country{id=1, name='中国', code='CN'}
//    Country{id=2, name='美国', code='US'}
//    Country{id=3, name='英国', code='GB'}
//    Country{id=4, name='法国', code='FR'}
//    Country{id=1, name='中国', code='CN'}
//    Country{id=2, name='美国', code='US'}
//    Country{id=3, name='英国', code='GB'}
//    Country{id=4, name='法国', code='FR'}
//    DEBUG[main]-Resetting autocommit to true on JDBC Connection [com.mysql.jdbc.JDBC4Connection@6a1aab78]
//    DEBUG[main]-Closing JDBC Connection [com.mysql.jdbc.JDBC4Connection@6a1aab78]
//    DEBUG[main]-Returned connection 1780132728 to pool.
}
