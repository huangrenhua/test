package com.huang.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrenhua
 * @Date 2020/4/24 17:36
 */
@RestController
@RequestMapping("/docker")
public class DockerDemo {
    @RequestMapping ("/test")
    public String test(){
        return "hello docker";
    }

}
