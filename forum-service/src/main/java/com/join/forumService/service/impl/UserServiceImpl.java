package com.join.forumService.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.join.forumDao.mapper.UserMapper;
import com.join.forumService.entity.User;
import com.join.forumService.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper<User>, User> implements UserService {


}
