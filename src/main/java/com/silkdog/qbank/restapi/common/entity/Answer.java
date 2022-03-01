package com.silkdog.qbank.restapi.common.entity;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "answer")
public class Answer extends CRUDLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String quizUuid;
    private int quizType; // 1: 선택, 2: 단답(input=text), 3: 서술 (textarea) TODO: refer to QuizType
    private String answer; // 정답
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

}
