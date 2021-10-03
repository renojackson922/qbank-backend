package com.silkdog.qbank.restapi.create.controller;

import com.silkdog.qbank.restapi.create.domain.Quiz;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("create")
public class CreateController {

    private final QuizService quizService;

    @GetMapping
    public Quiz getQuiz(@RequestParam String uuid) {
        return this.quizService.getQuiz(uuid);
    }

    @PostMapping
    public int insertQuiz(@RequestBody Quiz quiz) {
        return this.quizService.createQuiz(quiz);
    }

    @PutMapping
    public int updateQuiz(@RequestBody Quiz quiz) {
        return this.quizService.updateQuiz(quiz);
    }

    @DeleteMapping
    public int deleteQuiz(@RequestParam String uuid) {
        return this.quizService.deleteQuiz(uuid);
    }

}
