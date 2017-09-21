package com.tjw.domain;

import java.io.Serializable;

/**
 * @Author jingwen.tang
 * Created ON 2017/9/21 上午 11:41.
 * @Position Beijing
 */
public class User implements Serializable {
    private String id;
    private String userName;
    private String password;
    private String name;
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
