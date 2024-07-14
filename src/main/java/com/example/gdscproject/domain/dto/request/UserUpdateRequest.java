package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.JobEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    private String name;
    private String email;
    private Integer age;
    private String job;

}
