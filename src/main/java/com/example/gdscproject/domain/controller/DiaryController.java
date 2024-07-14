package com.example.gdscproject.domain.controller;

import com.example.gdscproject.domain.dto.request.DiaryCreateRequest;
import com.example.gdscproject.domain.dto.request.DiaryUpdateRequest;
import com.example.gdscproject.domain.dto.response.DiaryFindResponse;
import com.example.gdscproject.domain.service.DiaryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/diaries")
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
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
