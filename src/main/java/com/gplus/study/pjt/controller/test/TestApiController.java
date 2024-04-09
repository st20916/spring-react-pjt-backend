package com.gplus.study.pjt.controller.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApiController {
    /**
     *  React와 API 통신 테스트
     *
     *  @author     jjlee
     *  @date       2024.04.09
     *  @return     Hello, World 여긴 index
     */
    @GetMapping("/api/test")
    public String test() {
        return "Hello, World 여긴 index";
    }
}