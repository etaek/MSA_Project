package com.example.MSA_Project.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor  // 파라미터가 없는 생성자 
@AllArgsConstructor //모든 생성자
//@RequiredArgsConstructor //final 이 붙거나 @NotNull이 붙은 필드의 생성자를 자동 생성
public class User {
    private String id;
    private String name;
    private int age;


}
