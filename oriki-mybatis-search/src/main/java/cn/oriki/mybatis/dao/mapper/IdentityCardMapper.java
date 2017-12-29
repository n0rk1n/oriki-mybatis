package cn.oriki.mybatis.dao.mapper;

import cn.oriki.mybatis.domain.IdentityCard;

public interface IdentityCardMapper {

    /**
     * 根据id查询身份证信息
     *
     * @param id
     * @return
     */
    public IdentityCard queryById(Integer id);

}
