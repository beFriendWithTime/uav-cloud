package com.hctd.modules.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @GetMapping("/demo")
    public  String demo(){
        return "demo-successful";
    }

    public String demoTest(){
        return "demo-successful";
    }

}
