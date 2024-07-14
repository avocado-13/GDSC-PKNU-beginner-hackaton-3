package com.example.gdscproject.domain.dto.response;

import com.example.gdscproject.model.entity.Challenge;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChallengeFindResponse {
    @JsonProperty("challenge_id")
    private Long id;
    @JsonProperty("challenge_name")
    private String name;
    @JsonProperty("progress")
    private Integer progress;
    @JsonProperty("deadline")
    private LocalDate deadline;
    @JsonProperty("content")
    private String content;

    public static ChallengeFindResponse of(Challenge challenge){
        return ChallengeFindResponse.builder()
                .id(challenge.getId())
                .name(challenge.getName())
                .progress(challenge.getProgress())
                .deadline(challenge.getDeadline())
                .content(challenge.getContent())
                .build();
    }
}
