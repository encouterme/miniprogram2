package com.aode.bean;

public class Registration_department {
    private Integer reginfoId;

    private Integer reginfoDepartmentid;

    private String reginfoName;

    private String reginfoDepartment;

    private String reginfoMajor;

    private String reginfoPhonenumber;

    private String reginfoQq;

    private String reginfoWechar;

    private String reginfoAddreasons;

    private String reginfoIntroduction;

    public Integer getReginfoId() {
        return reginfoId;
    }

    public void setReginfoId(Integer reginfoId) {
        this.reginfoId = reginfoId;
    }

    public Integer getReginfoDepartmentid() {
        return reginfoDepartmentid;
    }

    public void setReginfoDepartmentid(Integer reginfoDepartmentid) {
        this.reginfoDepartmentid = reginfoDepartmentid;
    }

    public String getReginfoName() {
        return reginfoName;
    }

    public void setReginfoName(String reginfoName) {
        this.reginfoName = reginfoName == null ? null : reginfoName.trim();
    }

    public String getReginfoDepartment() {
        return reginfoDepartment;
    }

    public void setReginfoDepartment(String reginfoDepartment) {
        this.reginfoDepartment = reginfoDepartment == null ? null : reginfoDepartment.trim();
    }

    public String getReginfoMajor() {
        return reginfoMajor;
    }

    public void setReginfoMajor(String reginfoMajor) {
        this.reginfoMajor = reginfoMajor == null ? null : reginfoMajor.trim();
    }

    public String getReginfoPhonenumber() {
        return reginfoPhonenumber;
    }

    public void setReginfoPhonenumber(String reginfoPhonenumber) {
        this.reginfoPhonenumber = reginfoPhonenumber == null ? null : reginfoPhonenumber.trim();
    }

    public String getReginfoQq() {
        return reginfoQq;
    }

    public void setReginfoQq(String reginfoQq) {
        this.reginfoQq = reginfoQq == null ? null : reginfoQq.trim();
    }

    public String getReginfoWechar() {
        return reginfoWechar;
    }

    public void setReginfoWechar(String reginfoWechar) {
        this.reginfoWechar = reginfoWechar == null ? null : reginfoWechar.trim();
    }

    public String getReginfoAddreasons() {
        return reginfoAddreasons;
    }

    public void setReginfoAddreasons(String reginfoAddreasons) {
        this.reginfoAddreasons = reginfoAddreasons == null ? null : reginfoAddreasons.trim();
    }

    public String getReginfoIntroduction() {
        return reginfoIntroduction;
    }

    public void setReginfoIntroduction(String reginfoIntroduction) {
        this.reginfoIntroduction = reginfoIntroduction == null ? null : reginfoIntroduction.trim();
    }
}