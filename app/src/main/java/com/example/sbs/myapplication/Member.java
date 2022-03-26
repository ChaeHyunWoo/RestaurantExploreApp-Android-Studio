package com.example.sbs.myapplication;

public class Member {
    private int id;
    private String loginId;
    private String loginPasswd;
    private String name;

    public Member(int id, String loginId, String loginPasswd, String name) {
        this.id = id;
        this.loginId = loginId;
        this.loginPasswd = loginPasswd;
        this.name = name;
    }

    public Member() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", loginPasswd='" + loginPasswd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}