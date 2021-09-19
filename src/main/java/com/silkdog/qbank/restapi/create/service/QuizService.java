package com.silkdog.qbank.restapi.create.service;

import com.silkdog.qbank.restapi.create.domain.QuestionInfo;

public interface QuizService {

    QuestionInfo getQuiz(String uuid);

    int createQuiz(QuestionInfo questionInfo);

    int updateQuiz(QuestionInfo questionInfo);

    int deleteQuiz(String uuid);
}
