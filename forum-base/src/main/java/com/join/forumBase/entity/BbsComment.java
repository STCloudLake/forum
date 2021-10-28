package com.join.forumBase.entity;

import java.io.Serializable;

/**
 * @TableName bbs_comment
 */
public class BbsComment implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String commentContent;

    /**
     *
     */
    private Long commentUserId;

    /**
     * 用于多级评论，分级
     */
    private Long commentCommentId;

    /**
     *
     */
    private Long commentArticleId;

    /**
     * 发表评论的时间
     */
    private String commentSdtime;

    /**
     * 评论点赞数
     */
    private Integer commentLikes;

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
    public String getCommentContent() {
        return commentContent;
    }

    /**
     *
     */
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    /**
     *
     */
    public Long getCommentUserId() {
        return commentUserId;
    }

    /**
     *
     */
    public void setCommentUserId(Long commentUserId) {
        this.commentUserId = commentUserId;
    }

    /**
     * 用于多级评论，分级
     */
    public Long getCommentCommentId() {
        return commentCommentId;
    }

    /**
     * 用于多级评论，分级
     */
    public void setCommentCommentId(Long commentCommentId) {
        this.commentCommentId = commentCommentId;
    }

    /**
     *
     */
    public Long getCommentArticleId() {
        return commentArticleId;
    }

    /**
     *
     */
    public void setCommentArticleId(Long commentArticleId) {
        this.commentArticleId = commentArticleId;
    }

    /**
     * 发表评论的时间
     */
    public String getCommentSdtime() {
        return commentSdtime;
    }

    /**
     * 发表评论的时间
     */
    public void setCommentSdtime(String commentSdtime) {
        this.commentSdtime = commentSdtime;
    }

    /**
     * 评论点赞数
     */
    public Integer getCommentLikes() {
        return commentLikes;
    }

    /**
     * 评论点赞数
     */
    public void setCommentLikes(Integer commentLikes) {
        this.commentLikes = commentLikes;
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
        BbsComment other = (BbsComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCommentContent() == null ? other.getCommentContent() == null : this.getCommentContent().equals(other.getCommentContent()))
                && (this.getCommentUserId() == null ? other.getCommentUserId() == null : this.getCommentUserId().equals(other.getCommentUserId()))
                && (this.getCommentCommentId() == null ? other.getCommentCommentId() == null : this.getCommentCommentId().equals(other.getCommentCommentId()))
                && (this.getCommentArticleId() == null ? other.getCommentArticleId() == null : this.getCommentArticleId().equals(other.getCommentArticleId()))
                && (this.getCommentSdtime() == null ? other.getCommentSdtime() == null : this.getCommentSdtime().equals(other.getCommentSdtime()))
                && (this.getCommentLikes() == null ? other.getCommentLikes() == null : this.getCommentLikes().equals(other.getCommentLikes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCommentContent() == null) ? 0 : getCommentContent().hashCode());
        result = prime * result + ((getCommentUserId() == null) ? 0 : getCommentUserId().hashCode());
        result = prime * result + ((getCommentCommentId() == null) ? 0 : getCommentCommentId().hashCode());
        result = prime * result + ((getCommentArticleId() == null) ? 0 : getCommentArticleId().hashCode());
        result = prime * result + ((getCommentSdtime() == null) ? 0 : getCommentSdtime().hashCode());
        result = prime * result + ((getCommentLikes() == null) ? 0 : getCommentLikes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", commentContent=").append(commentContent);
        sb.append(", commentUserId=").append(commentUserId);
        sb.append(", commentCommentId=").append(commentCommentId);
        sb.append(", commentArticleId=").append(commentArticleId);
        sb.append(", commentSdtime=").append(commentSdtime);
        sb.append(", commentLikes=").append(commentLikes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}