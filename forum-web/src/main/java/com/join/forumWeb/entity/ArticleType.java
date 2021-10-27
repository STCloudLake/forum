package com.join.forumWeb.entity;

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
@TableName("bbs_article_type")
public class ArticleType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章类型名
     */
    private String typeName;

    /**
     * 文章类型名的说明
     */
    private String typeInfo;

    /**
     * 文章父类型
     */
    private String typeParents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }
    public String getTypeParents() {
        return typeParents;
    }

    public void setTypeParents(String typeParents) {
        this.typeParents = typeParents;
    }

    @Override
    public String toString() {
        return "ArticleType{" +
            "id=" + id +
            ", typeName=" + typeName +
            ", typeInfo=" + typeInfo +
            ", typeParents=" + typeParents +
        "}";
    }
}
