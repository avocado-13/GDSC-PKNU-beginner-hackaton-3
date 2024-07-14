package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.JobEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {
    @JsonProperty("user_name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("job")
    private String job;

}
