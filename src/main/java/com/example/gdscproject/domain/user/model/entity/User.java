package com.example.gdscproject.domain.user.model.entity;

import com.example.gdscproject.common.JobEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String name;

    private String email;
    private Integer age;

    @Enumerated(EnumType.ORDINAL)
    private Enum<JobEnum> job;

}
