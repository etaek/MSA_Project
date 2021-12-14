package com.example.MSA_Project.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import com.example.MSA_Project.entity.User;
@RestController // 주로 json형태의 데이터를 반한하기 위함
                //@Controller와 @ResponseBody의 조합

public class UserController {

    @ApiOperation(value="사용자목록조회",httpMethod = "GET",notes="사용자목록조회")
    @GetMapping("/users")
    public List<User> getUserList(){
        User user1=new User("1001","user1",21);
        User user2=new User("1002","user2",22);
        User user3=new User("1003","user3",23);

        List<User>list=new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        return list;
    }

    @ApiOperation(value="사용자상세조회",httpMethod = "GET",notes="사용자상세조회")
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id){
        User user=new User(id,"user1",21);
        return user;
    }

    @ApiOperation(value="사용자등록",httpMethod = "POST",notes = "사용자등록")
    @PostMapping("/users")
    public User joinUser(@RequestBody User user){
        user.setId("1005");
        return user;
    }

    @ApiOperation(value="사용자수정",httpMethod = "PUT",notes="사용자수정")
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        return user;
    }

    @ApiOperation(value="사용자삭제",httpMethod = "DELETE",notes="사용자삭제")
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id){
        return "Successfully Deleted";
    }
}
