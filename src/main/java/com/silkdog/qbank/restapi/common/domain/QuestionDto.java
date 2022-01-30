package com.silkdog.qbank.restapi.common.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonSerialize
@Data
public class QuestionDto {
    private long id;
    private String quizUuid; // 퀴즈번호 (Unique)
    private int quizType; // 1: &#xC120;&#xD0DD;, 2: &#xB2E8;&#xB2F5;(input=text), 3: &#xC11C;&#xC220; (textarea) TODO: refer to QuizType
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
