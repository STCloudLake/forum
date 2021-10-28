package com.join.forumWeb.controller;


import com.join.forumService.service.CommentService;
import com.join.forumWeb.entity.Comment;
import com.join.forumWeb.util.ReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public ReturnUtil addComment(@RequestBody Comment comment,
                                 @RequestParam("commentUserId")Long commentUserId,
                                 @RequestParam("commentArticleId")Long commentArticleId,
                                 @RequestParam("commentContent")String commentContent,
                                 @RequestParam("commentCommentId")Long commentCommentId){
        int count = commentService.addComment();
        if (count > 0){
            return ReturnUtil.success("发布评论成功",comment);
        }
        return ReturnUtil.fail("发布评论失败");
    }

    @RequestMapping("/deleteComment")
    public ReturnUtil delete(@RequestParam("commentId")Integer commentId){
        int count = commentService.deleteComment();
        if (count > 0){
            return ReturnUtil.success("删除评论成功");
        }
        return ReturnUtil.fail("删除评论失败");

    }
}
