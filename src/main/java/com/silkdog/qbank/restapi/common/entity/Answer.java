package com.silkdog.qbank.restapi.common.entity;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
//@Entity(name = "answer")
public class Answer extends CRUDLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int aid; // 정답 ID
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private String answer; // 정답

}
