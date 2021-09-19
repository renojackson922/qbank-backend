package com.silkdog.qbank.restapi.create.service.impl;

import com.silkdog.qbank.restapi.create.domain.QuestionInfo;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    @Override
    public QuestionInfo getQuiz(String uuid) {
        return new QuestionInfo();
    }

    @Override
    public int createQuiz(QuestionInfo questionInfo) {
        return 0;
    }

    @Override
    public int updateQuiz(QuestionInfo questionInfo) {
        return 0;
    }

    @Override
    public int deleteQuiz(String uuid) {
        return 0;
    }
}
