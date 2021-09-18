package com.silkdog.qbank.restapi.create.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class QuestionInfo {

    private UUID uuid;
    private String questionName;
    private String author;
    private LocalDate createDate;
    private LocalDate updateDate;
    private List<Question> questionList;

}
