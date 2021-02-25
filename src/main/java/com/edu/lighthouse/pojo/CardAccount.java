package com.edu.lighthouse.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "card_account")
public class CardAccount {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 对应卡信息
     */
    @Column(name = "card_id")
    private Integer cardId;

    /**
     * 余额
     */
    @Column(name = "balance")
    private BigDecimal balance;

    /**
     * 卡账户状态：1-正常；2-被锁定
     */
    @Column(name = "account_status")
    private Integer accountStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取对应卡信息
     *
     * @return card_id - 对应卡信息
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * 设置对应卡信息
     *
     * @param cardId 对应卡信息
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取卡账户状态：1-正常；2-被锁定
     *
     * @return account_status - 卡账户状态：1-正常；2-被锁定
     */
    public Integer getAccountStatus() {
        return accountStatus;
    }

    /**
     * 设置卡账户状态：1-正常；2-被锁定
     *
     * @param accountStatus 卡账户状态：1-正常；2-被锁定
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}