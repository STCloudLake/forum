package com.join.forumService.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.join.forumService.entity.Article;
import com.join.forumService.mapper.ArticleMapper;
import com.join.forumService.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper<Article>, Article> implements ArticleService {

}
