package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryUpdateRequest {
    @JsonProperty("diary_name")
    private String name;
    @JsonProperty("content")
    private String content;
    @JsonProperty("emotion")
    private String emotion;
    @JsonProperty("rating")
    private Integer rating;
}
