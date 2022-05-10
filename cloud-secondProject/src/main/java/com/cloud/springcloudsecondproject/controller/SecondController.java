package com.cloud.springcloudsecondproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {SpringCloud-secondProject}
 * @Date: {2022/05/10 && 3:14 PM}
 */

@RestController
@RequestMapping("/consumer")
public class SecondController {

    @GetMapping("/message")
    public String test(){
        return "Hello second called ";
    }
}
