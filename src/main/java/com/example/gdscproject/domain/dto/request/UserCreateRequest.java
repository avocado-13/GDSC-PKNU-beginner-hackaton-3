package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.JobEnum;
import com.example.gdscproject.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreateRequest {
    private String name;
    private String email;
    private Integer age;
    private String job;

    public User toEntity(UserCreateRequest userCreateRequest){
        return User.builder()
                .name(name)
                .email(email)
                .age(age)
                .job(job)
                .build();
    }
}
