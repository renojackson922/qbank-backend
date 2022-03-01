package com.silkdog.qbank.restapi.common.repository;

import com.silkdog.qbank.restapi.common.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
//    int save(Question question);


    @Override
    <S extends Question> S save(S entity);

    Question findByQuizUuid(String quizUuid);

    List<Question> findListByQuizUuid(String quizUuid);
}
