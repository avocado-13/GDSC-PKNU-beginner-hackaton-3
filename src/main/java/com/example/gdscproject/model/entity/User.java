package com.example.gdscproject.model.entity;

import com.example.gdscproject.common.JobEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    private String email;
    private Integer age;

    private String job;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Diary> diaries;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Challenge> challenges;

    public void update(String name, String email, Integer age, String job){
        this.name = name;
        this.email = email;
        this.age = age;
        this.job = job;
    }

}
