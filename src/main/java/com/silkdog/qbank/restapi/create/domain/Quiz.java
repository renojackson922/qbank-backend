package com.silkdog.qbank.restapi.create.domain;

import com.silkdog.qbank.util.CRUDLog;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Quiz extends CRUDLog {

    private UUID uuid;
    private String qName;
    private String author;
    private LocalDate createDate;
    private LocalDate updateDate;
    private List<Question> questionList;

}
