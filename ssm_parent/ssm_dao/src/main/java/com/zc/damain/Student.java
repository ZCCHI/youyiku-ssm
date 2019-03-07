package com.zc.damain;

/**
 * @author zhangchi
 * @create 2019-02-21
 */
public class Student {

    private int id;
    private String loginacct;
    private String password;
    private String email;
    private String name;
    private String realname;
    private String cardid;
    private String stutas;
    private String createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public void setStutas(String stutas) {
        this.stutas = stutas;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getCardid() {
        return cardid;
    }

    public String getStutas() {
        return stutas;
    }

    public String getCreatetime() {
        return createtime;
    }
}
