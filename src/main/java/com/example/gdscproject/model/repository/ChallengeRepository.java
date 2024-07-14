package com.example.gdscproject.model.repository;

import com.example.gdscproject.domain.dto.response.ChallengeFindResponse;
import com.example.gdscproject.model.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
    @Query(value = "select new com.example.gdscproject.domain.dto.response.ChallengeFindResponse(c.id, c.name, c.progress, c.deadline, c.content) " +
            "from Challenge c"
    )
    List<ChallengeFindResponse> findAllChallenges();
}
