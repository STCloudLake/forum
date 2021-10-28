package com.join.forumWeb.controller;


import org.springframework.stereotype.Controller;
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
@RequestMapping("/forumWeb/user")
public class UserController {

    @RequestMapping("/add/signature")
    public String addSignature(@RequestParam("userSignature")String userSignature) {


        return "";
    }

}
