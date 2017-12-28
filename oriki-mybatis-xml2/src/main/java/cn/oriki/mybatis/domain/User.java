package cn.oriki.mybatis.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String info;
    private Byte[] img;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Byte[] getImg() {
        return img;
    }

    public void setImg(Byte[] img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User(Integer id, String username, String password, String email, String info, Byte[] img, Date createTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.info = info;
        this.img = img;
        this.createTime = createTime;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", info='" + info + '\'' +
                ", img=" + Arrays.toString(img) +
                ", createTime=" + createTime +
                '}';
    }
}
