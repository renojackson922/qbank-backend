package com.silkdog.qbank.restapi.create.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer extends CRUDLog {

    private int aid; // 정답 ID
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private String answer; // 정답

}
