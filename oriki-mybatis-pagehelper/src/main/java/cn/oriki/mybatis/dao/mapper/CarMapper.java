package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Car;

public interface CarMapper {

    /**
     * 存储汽车数据
     *
     * @param car
     * @return
     */
    public Integer saveCar(Car car);
}
