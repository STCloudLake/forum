package com.join.forumService.entity;

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
@TableName("bbs_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论主体内容
     */
    private String commentContent;

    /**
     * 发表评论的用户id
     */
    private Long commentUserId;

    /**
     * 被评论的文章id
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

    /**
     * 被评论的评论id
     */
    private Long commentCommentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Long getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Long commentUserId) {
        this.commentUserId = commentUserId;
    }

    public Long getCommentArticleId() {
        return commentArticleId;
    }

    public void setCommentArticleId(Long commentArticleId) {
        this.commentArticleId = commentArticleId;
    }

    public String getCommentSdtime() {
        return commentSdtime;
    }

    public void setCommentSdtime(String commentSdtime) {
        this.commentSdtime = commentSdtime;
    }

    public Integer getCommentLikes() {
        return commentLikes;
    }

    public void setCommentLikes(Integer commentLikes) {
        this.commentLikes = commentLikes;
    }

    public Long getCommentCommentId() {
        return commentCommentId;
    }

    public void setCommentCommentId(Long commentCommentId) {
        this.commentCommentId = commentCommentId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentContent=" + commentContent +
                ", commentUserId=" + commentUserId +
                ", commentArticleId=" + commentArticleId +
                ", commentSdtime=" + commentSdtime +
                ", commentLikes=" + commentLikes +
                ", commentCommentId=" + commentCommentId +
                "}";
    }
}
