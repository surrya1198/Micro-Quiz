package com.practice.micrser.Question.QuizService.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import lombok.Data;
@Data
public class Question {
	private Long id;

    private String questionText;
    private String category;
    private String difficultyLevel;
    private String correctAnswer;

    @ElementCollection
    private List<String> options;
}
