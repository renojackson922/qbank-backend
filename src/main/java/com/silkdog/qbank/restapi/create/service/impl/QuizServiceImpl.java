package com.silkdog.qbank.restapi.create.service.impl;

import com.silkdog.qbank.restapi.create.domain.Quiz;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    @Override
    public Quiz getQuiz(String uuid) {
        return new Quiz();
    }

    @Override
    public int createQuiz(Quiz quiz) {
        return 0;
    }

    @Override
    public int updateQuiz(Quiz quiz) {
        return 0;
    }

    @Override
    public int deleteQuiz(String uuid) {
        return 0;
    }
}
