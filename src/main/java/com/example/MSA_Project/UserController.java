package com.example.MSA_Project;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import com.example.MSA_Project.User;
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
}
