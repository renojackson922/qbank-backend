package com.silkdog.qbank.restapi.common.repository;

import com.silkdog.qbank.restapi.common.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
//    int save(Answer answer);


    @Override
    <S extends Answer> S save(S entity);

    Answer findByQuizUuid(String quizUuid);

    List<Answer> findListByQuizUuid(String quizUuid);
}
