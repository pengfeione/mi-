package com.mehome.domain;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;

public class CompanyWelfare {
    private Integer welfareId;

    private String welfareContent;

    private Integer companyId;

    private Boolean isSelect;

    private Boolean welfareActive;

    private Date updateTime;

    public Integer getWelfareId() {
        return welfareId;
    }

    public void setWelfareId(Integer welfareId) {
        this.welfareId = welfareId;
    }

    public String getWelfareContent() {
        return welfareContent;
    }

    public void setWelfareContent(String welfareContent) {
        this.welfareContent = welfareContent == null ? null : welfareContent.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Boolean getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
    }

    public Boolean getWelfareActive() {
        return welfareActive;
    }

    public void setWelfareActive(Boolean welfareActive) {
        this.welfareActive = welfareActive;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getSelect() {
        return isSelect;
    }

    public void setSelect(Boolean select) {
        isSelect = select;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}