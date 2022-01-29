package com.silkdog.qbank.restapi.common.entity;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
//@Entity(name = "question")
public class Question extends CRUDLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int qid; // 퀴즈번호 (Unique)
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private String multiYn;  // Y, N
    private int minLength;
    private int maxLength;
    private String question;
    private int exampleType; // 보기유형
    private String exampleText;
    private List<String> exampleFilepath; // 보기 파일위치 TODO:(MAX:5)로 고정

}
