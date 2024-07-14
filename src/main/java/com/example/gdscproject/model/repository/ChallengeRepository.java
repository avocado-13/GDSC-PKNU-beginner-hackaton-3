package com.example.gdscproject.model.repository;

import com.example.gdscproject.model.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
