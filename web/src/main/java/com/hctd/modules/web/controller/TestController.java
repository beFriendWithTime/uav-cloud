package com.hctd.modules.web.controller;

import com.hctd.modules.demo.controller.DemoController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

        @GetMapping("/demoTest")
        public String demoTest(){
            DemoController demoController=new DemoController();
            String str=demoController.demoTest();
            return str+"--->web-successful";
        }

}
