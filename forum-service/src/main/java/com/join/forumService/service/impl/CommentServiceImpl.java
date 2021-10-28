package com.join.forumService.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.join.forumService.entity.Comment;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements IService<Comment> {

}
