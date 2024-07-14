package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import com.example.gdscproject.model.entity.Diary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiaryCreateRequest {
    private String name;
    private String content;
    private String emotion;
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
