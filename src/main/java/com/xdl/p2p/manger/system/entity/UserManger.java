package com.xdl.p2p.manger.system.entity;

import java.sql.Timestamp;
import java.util.Date;

public class UserManger {
    private Long useridm;

    private String usernamem;

    private String passwordm;

    private String phone;

    private String email;

    private Integer roleid;

    private Timestamp createtime;

    private Integer dr;

    public Long getUseridm() {
        return useridm;
    }

    public void setUseridm(Long useridm) {
        this.useridm = useridm;
    }

    public String getUsernamem() {
        return usernamem;
    }

    public void setUsernamem(String usernamem) {
        this.usernamem = usernamem == null ? null : usernamem.trim();
    }

    public String getPasswordm() {
        return passwordm;
    }

    public void setPasswordm(String passwordm) {
        this.passwordm = passwordm == null ? null : passwordm.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }
}