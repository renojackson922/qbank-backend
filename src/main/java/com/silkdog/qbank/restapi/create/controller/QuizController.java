package com.silkdog.qbank.restapi.create.controller;

import com.silkdog.qbank.restapi.common.entity.Quiz;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("quiz")
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/bulk")
    public ResponseEntity<?> makeUuid(){
        UUID uuid =  UUID.randomUUID();
        return ResponseEntity.ok(uuid);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<?> getQuiz(@PathVariable("uuid") String uuid) {
        System.out.println(this.quizService.getQuiz(uuid));
        return ResponseEntity.ok(this.quizService.getQuiz(uuid));
    }

    @PostMapping
    public int insertQuiz(@RequestBody Quiz quiz) {
        return this.quizService.createQuiz(quiz);
    }

    @PutMapping("/{uuid}")
    public int updateQuiz(@PathVariable String uuid,@RequestBody Quiz quiz) {
        return this.quizService.updateQuiz(quiz);
    }

    @DeleteMapping("/{uuid}")
    public int deleteQuiz(@PathVariable String uuid) {
        return this.quizService.deleteQuiz(uuid);
    }

}
