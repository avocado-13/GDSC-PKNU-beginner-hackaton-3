package com.example.gdscproject.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeUpdateRequest {
    @JsonProperty("challenge_name")
    private String name;
    @JsonProperty("progress")
    private Integer progress;
    @JsonProperty("deadline")
    private LocalDate deadline;
    @JsonProperty("content")
    private String content;
}
