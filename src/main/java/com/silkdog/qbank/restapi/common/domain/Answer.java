package com.silkdog.qbank.restapi.common.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Answer extends CRUDLog {
    private long id;
    private String quizUuid;
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private String answer; // 정답
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
