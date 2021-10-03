package com.silkdog.qbank.restapi.create.service;

import com.silkdog.qbank.restapi.create.domain.Quiz;

public interface QuizService {

    Quiz getQuiz(String uuid);

    int createQuiz(Quiz quiz);

    int updateQuiz(Quiz quiz);

    int deleteQuiz(String uuid);
}
