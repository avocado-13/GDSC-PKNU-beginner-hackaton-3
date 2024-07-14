package com.example.gdscproject.model.entity;

import com.example.gdscproject.common.EmotionEnum;
import com.example.gdscproject.common.RatingEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Diary {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diary_id")
    private Long id;

    @Column(name = "diary_name")
    private String name;

    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    private String emotion;
    private Integer rating;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public void update(String name, String emotion, Integer rating, String content){
        this.name = name;
        this.emotion = emotion;
        this.rating = rating;
        this.content = content;
    }
}
