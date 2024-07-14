package com.example.gdscproject.domain.dto.response;

import com.example.gdscproject.common.JobEnum;
import com.example.gdscproject.model.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserFindResponse {
    @JsonProperty("user_id")
    private Long id;
    @JsonProperty("user_name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("job")
    private String job;

    public static UserFindResponse of(User user){
        return UserFindResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .age(user.getAge())
                .job(user.getJob())
                .build();
    }

}
