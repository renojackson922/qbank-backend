package com.silkdog.qbank.restapi.common.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class QuizDto extends CRUDLog {

    private long id;
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
}
