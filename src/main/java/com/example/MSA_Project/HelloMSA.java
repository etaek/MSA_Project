package com.example.MSA_Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA {

    @GetMapping("/hello")
    public String hello(){
        return "Hello MSA World!";
    }


}
