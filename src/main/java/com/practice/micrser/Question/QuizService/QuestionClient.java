package com.practice.micrser.Question.QuizService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.practice.micrser.Question.QuizService.entity.Question;
@Component
@FeignClient(name = "QuestionService")
public interface QuestionClient {

	@GetMapping("/randomfivequestion")
	List<Question> getRandomFiveQuestion();

	@PostMapping("/fivequestion")

	public List<Question> getRandomFiveQuestion(@RequestBody List<Long> questionids);

}
