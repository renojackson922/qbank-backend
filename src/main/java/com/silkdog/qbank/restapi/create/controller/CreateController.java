package com.silkdog.qbank.restapi.create.controller;

import com.silkdog.qbank.restapi.create.domain.QuestionInfo;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("create")
public class CreateController {

    private final QuizService quizService;

    @GetMapping
    public QuestionInfo getQuiz(@RequestParam String uuid) {
        return this.quizService.getQuiz(uuid);
    }

    @PostMapping
    public int insertQuiz(@RequestBody QuestionInfo questionInfo) {
        return this.quizService.createQuiz(questionInfo);
    }

    @PutMapping
    public int updateQuiz(@RequestBody QuestionInfo questionInfo) {
        return this.quizService.updateQuiz(questionInfo);
    }

    @DeleteMapping
    public int deleteQuiz(@RequestParam String uuid) {
        return this.quizService.deleteQuiz(uuid);
    }

}
