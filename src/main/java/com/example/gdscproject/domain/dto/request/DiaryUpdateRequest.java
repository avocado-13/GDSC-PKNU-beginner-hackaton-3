package com.example.gdscproject.domain.dto.request;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryUpdateRequest {
    private String name;
    private String content;
    private String emotion;
    private Integer rating;
}
