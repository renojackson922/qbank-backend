package com.silkdog.qbank.restapi.create.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Question extends CRUDLog {

    private int qid; // 퀴즈번호 (Unique)
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private boolean multiYn;
    private int minLength;
    private int maxLength;
    private String question;
    private int exampleType; // 보기유형
    private String exampleText;
    private List<String> exampleFilepath; // 보기 파일위치 TODO:(MAX:5)로 고정

}
