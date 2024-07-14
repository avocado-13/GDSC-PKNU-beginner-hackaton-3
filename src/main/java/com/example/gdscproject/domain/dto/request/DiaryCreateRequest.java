package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import com.example.gdscproject.model.entity.Diary;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiaryCreateRequest {
    @JsonProperty("diary_name")
    private String name;
    @JsonProperty("content")
    private String content;
    @JsonProperty("emotion")
    private String emotion;
    @JsonProperty("rating")
    private Integer rating;

    public Diary toEntity(){
        return Diary.builder()
                .name(name)
                .content(content)
                .emotion(emotion)
                .rating(rating)
                .build();
    }
}
