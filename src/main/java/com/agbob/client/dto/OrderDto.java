package com.agbob.client.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderDto {

    /**
     * 订货单号
     */
    private String dealCode;

    /**
     * 订货单结算金额
     */
    private BigDecimal payAmount;

    /**
     * 订货单金额
     */
    private BigDecimal dealAmount;

    /**
     * 订货单金额
     */
    private Integer count;

    /**
     * 订货单结算状态
     */
    private Integer closeStatus;

    /**
     * 订货单状态
     */
    private Integer status;

    /**
     * 收件人姓名
     */
    private String name;

    /**
     * 收件人手机号
     */
    private String mobile;

    private String remark;

    private Date createTime;

    private int extractType;

    private String expNo;

    private String expName;

    private String expCode;

    //运费
    private BigDecimal freightAmount;

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(BigDecimal dealAmount) {
        this.dealAmount = dealAmount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(Integer closeStatus) {
        this.closeStatus = closeStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getExtractType() {
        return extractType;
    }

    public void setExtractType(int extractType) {
        this.extractType = extractType;
    }

    public String getExpNo() {
        return expNo;
    }

    public void setExpNo(String expNo) {
        this.expNo = expNo;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public String getExpCode() {
        return expCode;
    }

    public void setExpCode(String expCode) {
        this.expCode = expCode;
    }

    public BigDecimal getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(BigDecimal freightAmount) {
        this.freightAmount = freightAmount;
    }
}
