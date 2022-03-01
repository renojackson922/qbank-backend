package com.silkdog.qbank.restapi.create.controller;

import com.silkdog.qbank.restapi.common.domain.QnaDto;
import com.silkdog.qbank.restapi.create.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<?> insertQuestion(@RequestBody QnaDto qna) throws Exception {
        String quizUuid = qna.getQuizUuid();
        return ResponseEntity.ok(questionService.insertQuestion(quizUuid, qna));
    }

}
