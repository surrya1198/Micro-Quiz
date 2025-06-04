package com.practice.micrser.Question.QuizService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.micrser.Question.QuizService.QuestionClient;
import com.practice.micrser.Question.QuizService.entity.Question;
import com.practice.micrser.Question.QuizService.entity.Quiz;
import com.practice.micrser.Question.QuizService.repo.QuizRepository;

@Service
public class QuizService {

	@Autowired
	QuizRepository repository;

	@Autowired
	QuestionClient questionClient;

	public Quiz createQuiz(Quiz quiz) {
		return repository.save(quiz);
	}

	public List<Quiz> getAllQuizzes() {
		return repository.findAll();
	}

	public List<Question> getQuizById(Long id) {
		Quiz q = repository.findById(id).orElseThrow();
		if (q != null) {

			return questionClient.getRandomFiveQuestion(q.getQuestionIds());
		}else {
			
			throw new IllegalArgumentException("could not the find the quiz id");
		}
		
	}

	public List<Quiz> createQuiz(List<Quiz> quiz) {
		return repository.saveAll(quiz);
	}

//	public List<Question> getQuestionBasedQuizId() {
//
//		return null;
//	}

}
