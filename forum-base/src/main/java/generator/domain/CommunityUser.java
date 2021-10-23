package generator.domain;

import java.io.Serializable;

/**
 * 
 * @TableName community_user
 */
public class CommunityUser implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userNickname;

    /**
     * 
     */
    private Object userGender;

    /**
     * 
     */
    private String userPhone;

    /**
     * 
     */
    private String userEmail;

    /**
     * 
     */
    private String userSignature;

    /**
     * 
     */
    private String userHeadimage;

    /**
     * 
     */
    private Integer userAttertion;

    /**
     * 
     */
    private Integer userFans;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 
     */
    public Object getUserGender() {
        return userGender;
    }

    /**
     * 
     */
    public void setUserGender(Object userGender) {
        this.userGender = userGender;
    }

    /**
     * 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 
     */
    public String getUserSignature() {
        return userSignature;
    }

    /**
     * 
     */
    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    /**
     * 
     */
    public String getUserHeadimage() {
        return userHeadimage;
    }

    /**
     * 
     */
    public void setUserHeadimage(String userHeadimage) {
        this.userHeadimage = userHeadimage;
    }

    /**
     * 
     */
    public Integer getUserAttertion() {
        return userAttertion;
    }

    /**
     * 
     */
    public void setUserAttertion(Integer userAttertion) {
        this.userAttertion = userAttertion;
    }

    /**
     * 
     */
    public Integer getUserFans() {
        return userFans;
    }

    /**
     * 
     */
    public void setUserFans(Integer userFans) {
        this.userFans = userFans;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommunityUser other = (CommunityUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getUserGender() == null ? other.getUserGender() == null : this.getUserGender().equals(other.getUserGender()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserSignature() == null ? other.getUserSignature() == null : this.getUserSignature().equals(other.getUserSignature()))
            && (this.getUserHeadimage() == null ? other.getUserHeadimage() == null : this.getUserHeadimage().equals(other.getUserHeadimage()))
            && (this.getUserAttertion() == null ? other.getUserAttertion() == null : this.getUserAttertion().equals(other.getUserAttertion()))
            && (this.getUserFans() == null ? other.getUserFans() == null : this.getUserFans().equals(other.getUserFans()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getUserGender() == null) ? 0 : getUserGender().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserSignature() == null) ? 0 : getUserSignature().hashCode());
        result = prime * result + ((getUserHeadimage() == null) ? 0 : getUserHeadimage().hashCode());
        result = prime * result + ((getUserAttertion() == null) ? 0 : getUserAttertion().hashCode());
        result = prime * result + ((getUserFans() == null) ? 0 : getUserFans().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userGender=").append(userGender);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userSignature=").append(userSignature);
        sb.append(", userHeadimage=").append(userHeadimage);
        sb.append(", userAttertion=").append(userAttertion);
        sb.append(", userFans=").append(userFans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}