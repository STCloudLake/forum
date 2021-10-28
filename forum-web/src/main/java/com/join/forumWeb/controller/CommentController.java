package com.join.forumWeb.controller;


import com.join.forumService.service.CommentService;
import com.join.forumWeb.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author join
 * @since 2021-10-27
 */
@Controller
@RequestMapping("/forumWeb/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/addComment")
    public ReturnUtil addComment(@RequestParam("commentUserId")Long commentUserId,
                                 @RequestParam("commentArticleId")Long commentArticleId,
                                 @RequestParam("commentContent")String commentContent,
                                 @RequestParam("commentCommentId")Long commentCommentId){
//        int count = commentService.addComment();
        int count = 1;
        if (count > 0){
            return ReturnUtil.success("");
        }
        return ReturnUtil.fail("");
    }

    @RequestMapping("/deleteComment")
    public ReturnUtil delete(@RequestParam("commentId")Integer commentId){
//        int count = commentService.deleteComment();
        int count = 1;
        if (count > 0){
            return ReturnUtil.success("");
        }
        return ReturnUtil.fail("");

    }

}
