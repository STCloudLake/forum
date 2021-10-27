package com.join.forumService.service.impl;

import com.join.forumService.entity.Comment;
import com.join.forumService.mapper.CommentMapper;
import com.join.forumService.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
