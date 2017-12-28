package cn.oriki.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer id;
    private String name;
    private Integer enabled;
    private Integer createBy;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Role() {
    }

    public Role(Integer id, String name, Integer enabled, Integer createBy, Date createTime) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
        this.createBy = createBy;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enabled=" + enabled +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                '}';
    }
}
