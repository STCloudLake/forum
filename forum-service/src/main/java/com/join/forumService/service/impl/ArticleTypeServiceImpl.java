package com.join.forumService.service.impl;

import com.join.forumService.entity.ArticleType;
import com.join.forumService.mapper.ArticleTypeMapper;
import com.join.forumService.service.ArticleTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author join
 * @since 2021-10-28
 */
@Service
public class ArticleTypeServiceImpl extends ServiceImpl<ArticleTypeMapper<ArticleType>, ArticleType> implements ArticleTypeService {

}
