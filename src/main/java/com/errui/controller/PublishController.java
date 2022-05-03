package com.errui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Erruihhh
 * @Date: 2022/5/3
 * @Time: 12:02
 * @PROJECT_NAME: community
 * @Description:
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }
}