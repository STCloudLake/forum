package com.join.forumDao.entity;

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
@TableName("bbs_attention")
public class Attention implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 被关注的作者id
     */
    private Long attentionAuthorId;

    /**
     * 关注作者的用户id
     */
    private Long attentionUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getAttentionAuthorId() {
        return attentionAuthorId;
    }

    public void setAttentionAuthorId(Long attentionAuthorId) {
        this.attentionAuthorId = attentionAuthorId;
    }
    public Long getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Long attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

    @Override
    public String toString() {
        return "Attention{" +
            "id=" + id +
            ", attentionAuthorId=" + attentionAuthorId +
            ", attentionUserId=" + attentionUserId +
        "}";
    }
}
