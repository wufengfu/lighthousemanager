package com.edu.lighthouse.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "manager_user")
public class ManagerUser {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "login_pass")
    private String loginPass;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "del_flag")
    private Byte delFlag;

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
     * @return login_name
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * @return login_pass
     */
    public String getLoginPass() {
        return loginPass;
    }

    /**
     * @param loginPass
     */
    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return del_flag
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}