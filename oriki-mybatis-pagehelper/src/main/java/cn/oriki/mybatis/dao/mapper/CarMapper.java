package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Car;

import java.util.List;

public interface CarMapper {

    /**
     * 存储汽车数据
     *
     * @param car
     * @return
     */
    public Integer saveCar(Car car);

    /**
     * 查询所有汽车信息
     *
     * @return
     */
    public List<Car> queryAll();
}
