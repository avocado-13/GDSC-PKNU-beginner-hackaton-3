package com.example.gdscproject.domain.controller;

import com.example.gdscproject.domain.dto.request.ChallengeCreateRequest;
import com.example.gdscproject.domain.dto.request.ChallengeUpdateRequest;
import com.example.gdscproject.domain.dto.response.ChallengeFindResponse;
import com.example.gdscproject.domain.service.ChallengeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/challenges")
public class ChallengeController {
    private final ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @PostMapping("/")
    public Long addChallenge(@RequestBody ChallengeCreateRequest challengeCreateRequest){
        return challengeService.save(challengeCreateRequest);
    }

    @GetMapping("/{id}")
    public ChallengeFindResponse findChallenge(@PathVariable Long id){
        return challengeService.findById(id);
    }

    @PutMapping("/{id}")
    public void updateChallenge(@PathVariable Long id, @RequestBody ChallengeUpdateRequest challengeUpdateRequest){
        challengeService.update(id, challengeUpdateRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteChallenge(@PathVariable Long id){
        challengeService.delete(id);
    }
}
