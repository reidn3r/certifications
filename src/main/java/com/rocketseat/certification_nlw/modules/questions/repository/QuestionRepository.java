package com.rocketseat.certification_nlw.modules.questions.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.certification_nlw.modules.questions.domain.QuestionDomain;

public interface QuestionRepository extends JpaRepository<QuestionDomain, UUID>{

    Optional<List<QuestionDomain>> findByTechnology(String technology);
}
