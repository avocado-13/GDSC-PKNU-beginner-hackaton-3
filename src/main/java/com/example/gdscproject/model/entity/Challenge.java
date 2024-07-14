package com.example.gdscproject.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Challenge {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "challenge_id")
    private Long id;

    @Column(name = "challenge_name")
    private String name;

    private Integer progress;
    private LocalDate deadline;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public void update(String name, Integer progress, LocalDate deadline, String content){
        this.name = name;
        this.progress = progress;
        this.deadline = deadline;
        this.content = content;
    }
}
