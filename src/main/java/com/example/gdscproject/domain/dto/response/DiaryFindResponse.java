package com.example.gdscproject.domain.dto.response;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import com.example.gdscproject.model.entity.Diary;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiaryFindResponse {
    @JsonProperty("diary_id")
    private Long id;
    @JsonProperty("diary_name")
    private String name;
    @JsonProperty("content")
    private String content;
    @JsonProperty("emotion")
    private String emotion;
    @JsonProperty("rating")
    private Integer rating;

    public static DiaryFindResponse of(Diary diary){
        return DiaryFindResponse.builder()
                .id(diary.getId())
                .name(diary.getName())
                .content(diary.getContent())
                .emotion(diary.getEmotion())
                .rating(diary.getRating())
                .build();
    }

}
