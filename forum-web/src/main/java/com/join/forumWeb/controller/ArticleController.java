package com.join.forumWeb.controller;


import com.join.forumWeb.util.ReturnUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@Controller
@RequestMapping("/forumWeb/article")
public class ArticleController {

    public String uploadArticle() {


//        return ReturnUtil.success(data,msg).toString();
        return "";
    }


}
