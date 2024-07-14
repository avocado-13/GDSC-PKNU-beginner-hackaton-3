package com.example.gdscproject.domain.user.model.entity;

import com.example.gdscproject.common.EmotionEnum;
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
    private Long id;

    @Column(name = "diary_name")
    private String name;

    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Enumerated(EnumType.ORDINAL)
    private Enum<EmotionEnum> emotion;

    private String content;

}
