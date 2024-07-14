package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.model.entity.Challenge;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChallengeCreateRequest {
    @JsonProperty("challenge_name")
    private String name;
    @JsonProperty("progress")
    private Integer progress;
    @JsonProperty("deadline")
    private LocalDate deadline;
    @JsonProperty("content")
    private String content;

    public Challenge toEntity(){
        return Challenge.builder()
                .name(name)
                .progress(progress)
                .deadline(deadline)
                .content(content)
                .build();
    }
}
