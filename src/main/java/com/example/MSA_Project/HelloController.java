package com.example.MSA_Project;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello MSA World!";
    }

    @GetMapping("/hello2")
    public String welcome(@RequestParam String name){
        return "Welcome! Your Name is "+name;
    }

    @PostMapping("/hello3")
    public String welcome2(@RequestBody User user){

        return "Welcome! Your Name is "+user.getName()+","+user.getAge();
    }

}
