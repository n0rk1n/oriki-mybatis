package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.Person;

import java.util.List;

public interface PersonMapper {

    /**
     * 查询所有人
     *
     * @return
     */
    public List<Person> queryAll();
}
