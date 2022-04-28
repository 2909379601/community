package com.errui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Erruihhh
 * @Date: 2022/4/28
 * @Time: 22:14
 * @PROJECT_NAME: IndexController
 * @Description:
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}