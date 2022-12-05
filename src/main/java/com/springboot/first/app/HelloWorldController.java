package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //combination of @Controller + @ResponseBody
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return  "Hello World!";
    }
}
