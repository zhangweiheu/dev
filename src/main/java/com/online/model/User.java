package com.online.model;

import com.online.mybatis.enums.UserStatusEnum;
import com.online.mybatis.enums.UserTypeEnum;
import java.io.Serializable;
import java.util.Date;

/**
 * dev.user  
 *
 * @author zhang
 * @date 2016-7-27
 *
 */
public class User implements Serializable {
    /** id */
    private Integer id;

    /** 用户名 */
    private String username;

    /** 密码 */
    private String password;

    /** 用户类型：0普通用户 | 1管理员 | 2系统管理员 */
    private UserTypeEnum type;

    /** 状态:0未审核，1：审核不通过，2审核通过，3已删除，4黑名单 */
    private UserStatusEnum status;

    /** 头像 */
    private String avatar;

    /** 简介 */
    private String intro;

    /** 等级 */
    private String level;

    /** 邮箱 */
    private String email;

    /** 手机号 */
    private String phone;

    /** 微信号 */
    private String wechat;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}