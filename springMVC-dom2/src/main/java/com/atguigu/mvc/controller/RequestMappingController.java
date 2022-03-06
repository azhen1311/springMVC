package com.atguigu.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping("/testRequestMapping")
    public String success() {
        return "success";
    }

}
