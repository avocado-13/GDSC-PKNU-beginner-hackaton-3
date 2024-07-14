package com.example.gdscproject.model.repository;

import com.example.gdscproject.model.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
}
