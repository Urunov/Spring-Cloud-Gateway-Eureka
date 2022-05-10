package com.cloudproject.springcloudfirstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {SpringCloud-firstProject}
 * @Date: {2022/05/10 && 2:35 PM}
 */
@RestController
@RequestMapping("/employee")
public class FirstController {


    @GetMapping("/message")
    public String test() {
        return "Hello Java In Use Called in First Service";
    }
}
