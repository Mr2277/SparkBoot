package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class DemoController {
    @Autowired
    private SparkTestService sparkTestService;

    @RequestMapping("demo/spark")
    public Map<String, Object> sparkDemo() {
        System.out.println("fffffffffffff");
       // return null;
        return sparkTestService.sparkDemo();
    }
    @RequestMapping("/demo/s")
    public String sparkDeo() {
        System.out.println("fffffffffffff");

        return "index";
    }
}
