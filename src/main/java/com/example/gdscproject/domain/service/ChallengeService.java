package com.example.gdscproject.domain.service;

import com.example.gdscproject.domain.dto.request.ChallengeCreateRequest;
import com.example.gdscproject.domain.dto.request.ChallengeUpdateRequest;
import com.example.gdscproject.domain.dto.response.ChallengeFindResponse;
import com.example.gdscproject.model.entity.Challenge;
import com.example.gdscproject.model.repository.ChallengeRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeService {
    private final ChallengeRepository challengeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ChallengeService(ChallengeRepository challengeRepository, ModelMapper modelMapper) {
        this.challengeRepository = challengeRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public Long save(ChallengeCreateRequest challengeCreateRequest){
        return challengeRepository.save(challengeCreateRequest.toEntity()).getId();
    }

    @Transactional
    public ChallengeFindResponse findById(Long id){
        return modelMapper.map(id, ChallengeFindResponse.class);
    }

    @Transactional
    public void update(Long id, ChallengeUpdateRequest challengeUpdateRequest){
        Challenge challenge = challengeRepository.findById(id).orElseThrow(()->new RuntimeException(id + " Challenge not Found"));
        challenge.update(challengeUpdateRequest.getName(), challengeUpdateRequest.getProgress(), challengeUpdateRequest.getDeadline(), challengeUpdateRequest.getContent());
    }

    @Transactional
    public void delete(Long id){
        challengeRepository.deleteById(id);
    }

}
