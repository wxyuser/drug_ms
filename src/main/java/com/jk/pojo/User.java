package com.jk.pojo;

import java.io.Serializable;

public class User implements  Serializable{

    private static final long serialVersionUID = 7076591234965835172L;
    private   Integer id;
    private   String  userName;
    private   String  userSite;
    private   Integer userPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSite() {
        return userSite;
    }

    public void setUserSite(String userSite) {
        this.userSite = userSite;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSite='" + userSite + '\'' +
                ", userPhone=" + userPhone +
                '}';
    }
}
