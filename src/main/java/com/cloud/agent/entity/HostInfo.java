package com.cloud.agent.entity;

import java.util.Date;

/**
 * @ClassName:HostInfo.java
 * @Description: host的IP密码等信息
 */
public class HostInfo extends BaseEntity {


    /**
     *
     */
    private static final long serialVersionUID = 3875927332935900938L;


    /**
     * host名称
     */
    private String ip;

    /**
     * 用户
     */
    private String root;

    /**
     * ssh端口
     */
    private String port;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 密码
     */
    private String remark;


    /**
     * 创建时间
     */
    private Date createTime;


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}