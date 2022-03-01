package com.silkdog.qbank.restapi.common.entity;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "quiz")
public class Quiz extends CRUDLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "quiz_uuid")
    private String quizUuid;
    private String quizName;
    private long userId;
    private int tryCnt;
    private int finishCnt;
    private int reviewedCnt;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
//    private List<Question> questionList;

}
