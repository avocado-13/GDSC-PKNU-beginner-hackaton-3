package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.model.entity.Challenge;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChallengeCreateRequest {
    private String name;
    private Integer progress;
    private LocalDate deadline;
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
