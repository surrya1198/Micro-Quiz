package com.practice.micrser.Question.QuizService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.micrser.Question.QuizService.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
