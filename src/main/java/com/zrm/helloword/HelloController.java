package com.zrm.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("/jenkins")
    public String hello(){
        System.out.println("fuck you");
        return "hello jenkins and springboot";
    }
}
