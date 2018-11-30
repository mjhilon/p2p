package com.xdl.p2p.manger.system.entity;

import java.util.Date;

public class Banner {
    private Long id;

    private Long bannertype;

    private String bannertitle;

    private String bannerimg;

    private Date createTime;

    private Integer isUse;

    private Integer terminalType;

    private Integer dr;

    private String bannerurl;

    private Integer bannerno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBannertype() {
        return bannertype;
    }

    public void setBannertype(Long bannertype) {
        this.bannertype = bannertype;
    }

    public String getBannertitle() {
        return bannertitle;
    }

    public void setBannertitle(String bannertitle) {
        this.bannertitle = bannertitle == null ? null : bannertitle.trim();
    }

    public String getBannerimg() {
        return bannerimg;
    }

    public void setBannerimg(String bannerimg) {
        this.bannerimg = bannerimg == null ? null : bannerimg.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getBannerurl() {
        return bannerurl;
    }

    public void setBannerurl(String bannerurl) {
        this.bannerurl = bannerurl == null ? null : bannerurl.trim();
    }

    public Integer getBannerno() {
        return bannerno;
    }

    public void setBannerno(Integer bannerno) {
        this.bannerno = bannerno;
    }
}