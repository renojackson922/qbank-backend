package com.silkdog.qbank.restapi.common.repository;

import com.silkdog.qbank.restapi.common.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
