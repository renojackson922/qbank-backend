package com.silkdog.qbank.restapi.create.service;

import com.silkdog.qbank.restapi.common.domain.QuestionAndAnswerDto;

public interface QuestionService {
    int insertQuestion(String quizUuid, QuestionAndAnswerDto qna) throws Exception;
}
