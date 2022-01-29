package com.silkdog.qbank.restapi.common.repository;

import com.silkdog.qbank.restapi.common.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Quiz findByQuizUuid(String quizUuid);

    List<Quiz> findAll();

    Quiz findById(long id);

}
