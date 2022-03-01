package com.silkdog.qbank.restapi.create.service;

import com.silkdog.qbank.restapi.common.domain.QnaDto;

public interface QuestionService {
    int insertQuestion(String quizUuid, QnaDto qna) throws Exception;
}
