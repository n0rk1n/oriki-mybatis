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

    /**
     * 根据id查询个人信息和身份证信息
     *
     * @param id
     * @return
     */
    public Person queryPersonAndIdentityCardInfoByPersonId(Integer id);

    /**
     * 根据id查询个人信息和身份证信息
     *
     * @param id
     * @return
     */
    public Person queryPersonAndIdentityCardInfoByPersonId2(Integer id);

    /**
     * 根据id查询个人信息和身份证信息
     *
     * @param id
     * @return
     */
    public Person queryPersonAndIdentityCardInfoByPersonId3(Integer id);

}
