package com.silkdog.qbank.restapi.common.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Question extends CRUDLog {
    private long id;
    private String quizUuid; // 퀴즈번호 (Unique)
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private boolean multiYn;  // Y, N
    private int minLength;
    private int maxLength;
    private String question;
    private int exampleType; // 보기유형
    private String exampleText;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
