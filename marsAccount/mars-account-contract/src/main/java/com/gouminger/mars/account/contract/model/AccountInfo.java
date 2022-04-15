package com.gouminger.mars.account.contract.model;

import java.math.BigDecimal;

public class AccountInfo {

    private Long id;

    private Long userId;

    private BigDecimal money;

    private BigDecimal goldCoin;

    private Long createTime;

    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getGoldCoin() {
        return goldCoin;
    }

    public void setGoldCoin(BigDecimal goldCoin) {
        this.goldCoin = goldCoin;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
