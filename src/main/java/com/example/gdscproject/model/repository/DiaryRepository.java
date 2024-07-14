package com.example.gdscproject.model.repository;

import com.example.gdscproject.domain.dto.response.DiaryFindResponse;
import com.example.gdscproject.model.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    @Query(value = "select new com.example.gdscproject.domain.dto.response.DiaryFindResponse(d.id, d.name, d.content, d.emotion, d.rating) " +
            "from Diary d"
    )
    List<DiaryFindResponse> findAllDiaries();
}
