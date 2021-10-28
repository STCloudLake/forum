package com.join.forumWeb.controller;


import com.join.forumService.service.ArticleService;
import com.join.forumWeb.entity.Article;
import com.join.forumWeb.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@Controller
@RequestMapping("/forumWeb/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/upLoadArticle")
    public ReturnUtil upLoadArticle(@RequestBody Article article,
                                    @RequestParam("articleTitle")String articleTitle,
                                    @RequestParam("articleUserId")Integer articleUserId,
                                    @RequestParam("articleTypeId")Integer articleTypeId,
                                    @RequestPart("articleFile")MultipartFile articleFile) throws IOException {
/*
        //articleContent?
        if (!articleFile.isEmpty()) {
            String articleFileName = article.getOriginalFilename();
            article.transferTo(new File("D:\\java\\IDEA\\community\\joinForum\\forum-web\\src\\main\\resources\\static\\article" + articleFileName));
            //参数、上传时间?
            articleService.upLoadArticle();
            return ReturnUtil.success;
        }*/
        return ReturnUtil.fail("");
    }

    @RequestMapping("/deleteArticle")
    public ReturnUtil deleteArticle(@RequestParam("articleId")Integer articleId){
 /*       int count = articleService.deleteArticle(articleId);
        if (count > 0) {
            return ReturnUtil.success();
        }*/
        return ReturnUtil.fail("");
    }

    @RequestMapping("/updateArticle")
    public ReturnUtil updateArticle(@RequestParam("articleId")Integer articleId,
                                    @RequestPart("article")MultipartFile article){
/*        int count = articleService.updateArticle(articleId,article);
        //更新时间？
        if (count > 0) {
            return ReturnUtil.success();
        }*/
        return ReturnUtil.fail("");
    }

}
