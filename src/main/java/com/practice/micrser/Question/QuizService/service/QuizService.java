package com.practice.micrser.Question.QuizService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.micrser.Question.QuizService.entity.Quiz;
import com.practice.micrser.Question.QuizService.repo.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository repository;

	public Quiz createQuiz(Quiz quiz) {
		return repository.save(quiz);
	}

	public List<Quiz> getAllQuizzes() {
		return repository.findAll();
	}

	public Quiz getQuizById(Long id) {
		return repository.findById(id).orElseThrow();
	}
	
	public List<Quiz> createQuiz(List<Quiz> quiz) {
		return repository.saveAll(quiz);
	}

}
