package com.silkdog.qbank.restapi.create.service;

import com.silkdog.qbank.restapi.common.domain.QuizWithQnaDto;
import com.silkdog.qbank.restapi.common.entity.Quiz;

public interface QuizService {

    QuizWithQnaDto getQuiz(String uuid);

    int createQuiz(Quiz quiz);

    int updateQuiz(Quiz quiz);

    int deleteQuiz(String uuid);
}
