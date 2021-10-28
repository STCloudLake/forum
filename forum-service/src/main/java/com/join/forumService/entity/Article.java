package com.join.forumService.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@TableName("bbs_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章类型id
     */
    private Integer articleTypeId;

    /**
     * 作者id
     */
    private Integer articleUserId;

    /**
     * 文章主体内容
     */
    private String articleContent;

    /**
     * 文章浏览量
     */
    private Integer articleViews;

    /**
     * 文章发布时间
     */
    private LocalDateTime articleSdtime;

    /**
     * 文章修改时间
     */
    private LocalDateTime articleUptime;

    /**
     * 文章点赞量
     */
    private Integer articleLikes;

    /**
     * 文章收藏量
     */
    private Integer articleCollections;

    /**
     * 文章评论量
     */
    private Integer articleComments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(Integer articleUserId) {
        this.articleUserId = articleUserId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Integer articleViews) {
        this.articleViews = articleViews;
    }

    public LocalDateTime getArticleSdtime() {
        return articleSdtime;
    }

    public void setArticleSdtime(LocalDateTime articleSdtime) {
        this.articleSdtime = articleSdtime;
    }

    public LocalDateTime getArticleUptime() {
        return articleUptime;
    }

    public void setArticleUptime(LocalDateTime articleUptime) {
        this.articleUptime = articleUptime;
    }

    public Integer getArticleLikes() {
        return articleLikes;
    }

    public void setArticleLikes(Integer articleLikes) {
        this.articleLikes = articleLikes;
    }

    public Integer getArticleCollections() {
        return articleCollections;
    }

    public void setArticleCollections(Integer articleCollections) {
        this.articleCollections = articleCollections;
    }

    public Integer getArticleComments() {
        return articleComments;
    }

    public void setArticleComments(Integer articleComments) {
        this.articleComments = articleComments;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleTitle=" + articleTitle +
                ", articleTypeId=" + articleTypeId +
                ", articleUserId=" + articleUserId +
                ", articleContent=" + articleContent +
                ", articleViews=" + articleViews +
                ", articleSdtime=" + articleSdtime +
                ", articleUptime=" + articleUptime +
                ", articleLikes=" + articleLikes +
                ", articleCollections=" + articleCollections +
                ", articleComments=" + articleComments +
                "}";
    }
}
