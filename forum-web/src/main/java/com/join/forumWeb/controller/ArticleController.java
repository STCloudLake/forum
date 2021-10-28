package com.join.forumWeb.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.join.forumService.service.ArticleService;
import com.join.forumWeb.entity.Article;
import com.join.forumWeb.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/upLoadArticle")
    public ReturnUtil upLoadArticle(@RequestBody Article article,
                                    @RequestParam("articleTitle")String articleTitle,
                                    @RequestParam("articleUserId")Integer articleUserId,
                                    @RequestParam("articleTypeId")Integer articleTypeId,
                                    @RequestPart("articleFile") MultipartFile articleFile) throws IOException {

        //articleContent?
        if (!articleFile.isEmpty()) {
            String articleFileName = articleFile.getOriginalFilename();
            articleFile.transferTo(new File("D:\\java\\IDEA\\community\\joinForum\\forum-web\\src\\main\\resources\\static\\article" + articleFileName));
            //参数、上传时间?
            articleService.update(new UpdateWrapper<>());
            return ReturnUtil.success("发布文章成功",article);
        }
        return ReturnUtil.fail("发布文章失败");
    }

    @RequestMapping("/deleteArticle")
    public ReturnUtil deleteArticle(@RequestParam("articleId")Integer articleId){
        int count = articleService.remove(new );
        if (count > 0) {
            return ReturnUtil.success("删除文章成功");
        }
        return ReturnUtil.fail("删除文章失败");
    }

    @RequestMapping("/updateArticle")
    public ReturnUtil updateArticle(@RequestBody Article article1,
                                    @RequestParam("articleId")Integer articleId,
                                    @RequestPart("articleFile")MultipartFile articleFile) throws IOException {
        if (!articleFile.isEmpty()) {
            String articleFileName = articleFile.getOriginalFilename();
            articleFile.transferTo(new File("D:\\java\\IDEA\\community\\joinForum\\forum-web\\src\\main\\resources\\static\\article" + articleFileName));
            //参数、上传时间?
            articleService.updateArticle();
            return ReturnUtil.success("更新文章成功",articleFile);
        }
        return ReturnUtil.fail("更新文章失败");
    }


}
