package com.example.gdscproject.domain.service;

import com.example.gdscproject.domain.dto.request.DiaryCreateRequest;
import com.example.gdscproject.domain.dto.request.DiaryUpdateRequest;
import com.example.gdscproject.domain.dto.response.DiaryFindResponse;
import com.example.gdscproject.model.entity.Diary;
import com.example.gdscproject.model.repository.DiaryRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DiaryService {
    private final DiaryRepository diaryRepository;

    @Transactional
    public List<DiaryFindResponse> findAll(){
        return diaryRepository.findAllDiaries();
    }

    @Transactional
    public Long save(DiaryCreateRequest diaryCreateRequest){
        return diaryRepository.save(diaryCreateRequest.toEntity()).getId();
    }

    @Transactional
    public DiaryFindResponse findById(Long id){
        return DiaryFindResponse.of(diaryRepository.findById(id).get());
    }

    @Transactional
    public void update(Long id, DiaryUpdateRequest diaryUpdateRequest){
        Diary diary = diaryRepository.findById(id).orElseThrow(()->new RuntimeException(id + " Diary not Found"));
        diary.update(diaryUpdateRequest.getName(), diaryUpdateRequest.getEmotion(), diaryUpdateRequest.getRating(), diaryUpdateRequest.getContent());
    }

    @Transactional
    public void deleteById(Long id){
        diaryRepository.deleteById(id);
    }

}
