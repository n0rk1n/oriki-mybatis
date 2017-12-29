package cn.oriki.mybatis.domain;

import java.io.Serializable;
import java.util.List;

public class Permission implements Serializable {
    private Integer id;
    private String name;
    private String url;
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Permission(Integer id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Permission() {

    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
