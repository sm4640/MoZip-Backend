package com.mozip.mozip.domain.question.repository;

import com.mozip.mozip.domain.question.entity.PaperQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperQuestionRepository extends JpaRepository<PaperQuestion, String> {
}