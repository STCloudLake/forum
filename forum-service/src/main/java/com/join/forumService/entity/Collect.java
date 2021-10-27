package com.join.forumService.entity;

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
@TableName("bbs_collect")
public class Collect implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 被收藏的文章id
     */
    private Long collectArticleId;

    /**
     * 收藏文章的用户id
     */
    private Long collectUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCollectArticleId() {
        return collectArticleId;
    }

    public void setCollectArticleId(Long collectArticleId) {
        this.collectArticleId = collectArticleId;
    }
    public Long getCollectUserId() {
        return collectUserId;
    }

    public void setCollectUserId(Long collectUserId) {
        this.collectUserId = collectUserId;
    }

    @Override
    public String toString() {
        return "Collect{" +
            "id=" + id +
            ", collectArticleId=" + collectArticleId +
            ", collectUserId=" + collectUserId +
        "}";
    }
}
