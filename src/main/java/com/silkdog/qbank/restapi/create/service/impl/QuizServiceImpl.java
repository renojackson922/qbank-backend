package com.silkdog.qbank.restapi.create.service.impl;

import com.silkdog.qbank.restapi.common.entity.Quiz;
import com.silkdog.qbank.restapi.common.repository.QuizRepository;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public Quiz getQuiz(String quizUuid) {
        return this.quizRepository.findByQuizUuid(quizUuid);
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
