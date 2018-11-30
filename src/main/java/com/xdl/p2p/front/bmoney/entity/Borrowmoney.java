package com.xdl.p2p.front.bmoney.entity;

public class Borrowmoney {
    private Integer id;

    private String bserial;

    private String buserid;

    private String busername;

    private String bphone;

    private String btype;

    private String btitle;

    private String bmoney;

    private String brate;

    private String btimelimit;

    private String blimit;

    private String bstate;

    private String brecommend;

    private String bleixing;

    private String note1;

    private String note2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBserial() {
        return bserial;
    }

    public void setBserial(String bserial) {
        this.bserial = bserial == null ? null : bserial.trim();
    }

    public String getBuserid() {
        return buserid;
    }

    public void setBuserid(String buserid) {
        this.buserid = buserid == null ? null : buserid.trim();
    }

    public String getBusername() {
        return busername;
    }

    public void setBusername(String busername) {
        this.busername = busername == null ? null : busername.trim();
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone == null ? null : bphone.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle == null ? null : btitle.trim();
    }

    public String getBmoney() {
        return bmoney;
    }

    public void setBmoney(String bmoney) {
        this.bmoney = bmoney == null ? null : bmoney.trim();
    }

    public String getBrate() {
        return brate;
    }

    public void setBrate(String brate) {
        this.brate = brate == null ? null : brate.trim();
    }

    public String getBtimelimit() {
        return btimelimit;
    }

    public void setBtimelimit(String btimelimit) {
        this.btimelimit = btimelimit == null ? null : btimelimit.trim();
    }

    public String getBlimit() {
        return blimit;
    }

    public void setBlimit(String blimit) {
        this.blimit = blimit == null ? null : blimit.trim();
    }

    public String getBstate() {
        return bstate;
    }

    public void setBstate(String bstate) {
        this.bstate = bstate == null ? null : bstate.trim();
    }

    public String getBrecommend() {
        return brecommend;
    }

    public void setBrecommend(String brecommend) {
        this.brecommend = brecommend == null ? null : brecommend.trim();
    }

    public String getBleixing() {
        return bleixing;
    }

    public void setBleixing(String bleixing) {
        this.bleixing = bleixing == null ? null : bleixing.trim();
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }
}