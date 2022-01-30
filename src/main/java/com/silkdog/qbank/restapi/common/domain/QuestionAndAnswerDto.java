package com.silkdog.qbank.restapi.common.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionAndAnswerDto {
    private String quizUuid;
    @JsonProperty("question")
    private QuestionDto questionDto;
    @JsonProperty("answer")
    private AnswerDto answerDto;
}
