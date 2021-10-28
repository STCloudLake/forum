package com.join.forumDao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

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
@Data
@ToString
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
    private Long articleTypeId;

    /**
     * 作者id
     */
    private Long articleUserId;

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


}
