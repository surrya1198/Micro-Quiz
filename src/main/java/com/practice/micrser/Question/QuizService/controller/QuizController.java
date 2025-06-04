package com.practice.micrser.Question.QuizService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.micrser.Question.QuizService.entity.Question;
import com.practice.micrser.Question.QuizService.entity.Quiz;
import com.practice.micrser.Question.QuizService.service.QuizService;


@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService service;

	@PostMapping
	public ResponseEntity<Quiz> create(@RequestBody Quiz quiz) {
		return ResponseEntity.ok(service.createQuiz(quiz));
	}

	@GetMapping
	public ResponseEntity<List<Quiz>> getAll() {
		return ResponseEntity.ok(service.getAllQuizzes());
	}

	@GetMapping("/question/{id}")
	public ResponseEntity<List<Question>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(service.getQuizById(id));
	}
	
	@PostMapping("/bulkquiz")
	public ResponseEntity<List<Quiz>> create(@RequestBody List<Quiz> quiz) {
		return ResponseEntity.ok(service.createQuiz(quiz));
	}
}
