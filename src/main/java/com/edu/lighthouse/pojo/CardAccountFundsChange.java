package com.edu.lighthouse.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "card_account_funds_change")
public class CardAccountFundsChange {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 账户
     */
    @Column(name = "account_id")
    private String accountId;

    /**
     * 交易流水号
     */
    @Column(name = "payment_no")
    private String paymentNo;

    /**
     * 资金变动量
     */
    @Column(name = "change_funds")
    private BigDecimal changeFunds;

    /**
     * 变动前资金
     */
    @Column(name = "pre_change_funds")
    private BigDecimal preChangeFunds;

    /**
     * 变动后资金
     */
    @Column(name = "afe_change_funds")
    private BigDecimal afeChangeFunds;

    /**
     * 对应订单类型
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 对应订单号(扣款时  会有值)
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 变动类型（1-充值，2-扣款，3-返还，4-人工调授信额度）
     */
    @Column(name = "change_type")
    private Integer changeType;

    /**
     * 变动时间
     */
    @Column(name = "change_time")
    private Date changeTime;

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
     * 获取账户
     *
     * @return account_id - 账户
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置账户
     *
     * @param accountId 账户
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * 获取交易流水号
     *
     * @return payment_no - 交易流水号
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * 设置交易流水号
     *
     * @param paymentNo 交易流水号
     */
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    /**
     * 获取资金变动量
     *
     * @return change_funds - 资金变动量
     */
    public BigDecimal getChangeFunds() {
        return changeFunds;
    }

    /**
     * 设置资金变动量
     *
     * @param changeFunds 资金变动量
     */
    public void setChangeFunds(BigDecimal changeFunds) {
        this.changeFunds = changeFunds;
    }

    /**
     * 获取变动前资金
     *
     * @return pre_change_funds - 变动前资金
     */
    public BigDecimal getPreChangeFunds() {
        return preChangeFunds;
    }

    /**
     * 设置变动前资金
     *
     * @param preChangeFunds 变动前资金
     */
    public void setPreChangeFunds(BigDecimal preChangeFunds) {
        this.preChangeFunds = preChangeFunds;
    }

    /**
     * 获取变动后资金
     *
     * @return afe_change_funds - 变动后资金
     */
    public BigDecimal getAfeChangeFunds() {
        return afeChangeFunds;
    }

    /**
     * 设置变动后资金
     *
     * @param afeChangeFunds 变动后资金
     */
    public void setAfeChangeFunds(BigDecimal afeChangeFunds) {
        this.afeChangeFunds = afeChangeFunds;
    }

    /**
     * 获取对应订单类型
     *
     * @return order_type - 对应订单类型
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置对应订单类型
     *
     * @param orderType 对应订单类型
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取对应订单号(扣款时  会有值)
     *
     * @return order_no - 对应订单号(扣款时  会有值)
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置对应订单号(扣款时  会有值)
     *
     * @param orderNo 对应订单号(扣款时  会有值)
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取变动类型（1-充值，2-扣款，3-返还，4-人工调授信额度）
     *
     * @return change_type - 变动类型（1-充值，2-扣款，3-返还，4-人工调授信额度）
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * 设置变动类型（1-充值，2-扣款，3-返还，4-人工调授信额度）
     *
     * @param changeType 变动类型（1-充值，2-扣款，3-返还，4-人工调授信额度）
     */
    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    /**
     * 获取变动时间
     *
     * @return change_time - 变动时间
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * 设置变动时间
     *
     * @param changeTime 变动时间
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}