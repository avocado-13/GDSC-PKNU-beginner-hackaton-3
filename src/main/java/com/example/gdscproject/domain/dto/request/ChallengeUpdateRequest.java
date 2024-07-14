package com.example.gdscproject.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ChallengeUpdateRequest {
    private String name;
    private Integer progress;
    private LocalDate deadline;
    private String content;
}
