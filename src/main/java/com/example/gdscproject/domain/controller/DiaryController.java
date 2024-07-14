package com.example.gdscproject.domain.controller;

import com.example.gdscproject.domain.dto.request.DiaryCreateRequest;
import com.example.gdscproject.domain.dto.request.DiaryUpdateRequest;
import com.example.gdscproject.domain.dto.response.DiaryFindResponse;
import com.example.gdscproject.domain.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/diaries")
@CrossOrigin(origins = "http://localhost:3000")
public class DiaryController {
    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping("")
    public List<DiaryFindResponse> findAllDiaries(){
        return diaryService.findAll();
    }

    @PostMapping("/")
    public Long addDiary(@RequestBody DiaryCreateRequest diaryCreateRequest){
        return  diaryService.save(diaryCreateRequest);
    }

    @GetMapping("/{id}")
    public DiaryFindResponse findDiary(@PathVariable Long id){
        return diaryService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateDiary(@PathVariable Long id, @RequestBody DiaryUpdateRequest diaryUpdateRequest){
        diaryService.update(id, diaryUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteDiary(@PathVariable Long id){
        diaryService.deleteById(id);
    }
}
