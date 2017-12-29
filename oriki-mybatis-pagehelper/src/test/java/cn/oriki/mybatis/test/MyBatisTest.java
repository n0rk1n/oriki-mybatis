package cn.oriki.mybatis.test;

import cn.oriki.mybatis.dao.mapper.CarMapper;
import cn.oriki.mybatis.domain.Car;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);


        for (int i = 0; i <= 100; i++) {
            carMapper.saveCar(new Car(null, "汽车" + i));
        }

        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void test2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        CarMapper carMapper = sqlSession.getMapper(CarMapper.class);

        // 使用分页
        PageHelper.startPage(2, 5);

        // 查询数据
        List<Car> list = carMapper.queryAll();

        // 获得使用分页工具后的分页信息
        PageInfo<Car> pageInfo = new PageInfo<Car>(list);

        // 获得查询页的数据
        List<Car> cars = pageInfo.getList();
        for (Car car : cars) {
            System.out.println(car);
        }

        // 同样的,也可以获得一些其他的信息
        int startRow = pageInfo.getStartRow();
        System.out.println(startRow);

        int endRow = pageInfo.getEndRow();
        System.out.println(endRow);

    }
}
