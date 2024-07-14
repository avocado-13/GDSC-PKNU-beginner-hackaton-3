package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.model.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreateRequest {
    @JsonProperty("user_name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("job")
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
