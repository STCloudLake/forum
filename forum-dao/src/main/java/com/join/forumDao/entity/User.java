package com.join.forumDao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@TableName("community_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer userAccount;

    private String userPassword;

    private String userName;

    private String userGender;

    private String userPhone;

    private String userEmail;

    private String userSignature;

    private String userHeadimage;

    private Integer userAttertion;

    private Integer userFans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(Integer userAccount) {
        this.userAccount = userAccount;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }
    public String getUserHeadimage() {
        return userHeadimage;
    }

    public void setUserHeadimage(String userHeadimage) {
        this.userHeadimage = userHeadimage;
    }
    public Integer getUserAttertion() {
        return userAttertion;
    }

    public void setUserAttertion(Integer userAttertion) {
        this.userAttertion = userAttertion;
    }
    public Integer getUserFans() {
        return userFans;
    }

    public void setUserFans(Integer userFans) {
        this.userFans = userFans;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", userAccount=" + userAccount +
            ", userPassword=" + userPassword +
            ", userName=" + userName +
            ", userGender=" + userGender +
            ", userPhone=" + userPhone +
            ", userEmail=" + userEmail +
            ", userSignature=" + userSignature +
            ", userHeadimage=" + userHeadimage +
            ", userAttertion=" + userAttertion +
            ", userFans=" + userFans +
        "}";
    }
}
