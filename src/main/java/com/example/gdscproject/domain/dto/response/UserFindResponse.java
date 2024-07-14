package com.example.gdscproject.domain.dto.response;

import com.example.gdscproject.common.JobEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserFindResponse {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private String job;

}
