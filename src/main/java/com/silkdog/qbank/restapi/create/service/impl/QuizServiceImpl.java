package com.silkdog.qbank.restapi.create.service.impl;

import com.silkdog.qbank.common.Config.CustomModelMapper;
import com.silkdog.qbank.restapi.common.domain.QuestionDto;
import com.silkdog.qbank.restapi.common.domain.QuizWithQnaDto;
import com.silkdog.qbank.restapi.common.entity.Answer;
import com.silkdog.qbank.restapi.common.entity.Question;
import com.silkdog.qbank.restapi.common.entity.Quiz;
import com.silkdog.qbank.restapi.common.repository.AnswerRepository;
import com.silkdog.qbank.restapi.common.repository.QuestionRepository;
import com.silkdog.qbank.restapi.common.repository.QuizRepository;
import com.silkdog.qbank.restapi.create.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final CustomModelMapper customModelMapper;
    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    @Override
    public QuizWithQnaDto getQuiz(String quizUuid) {
        ModelMapper modelMapper = customModelMapper.looseMapper();
        Quiz quiz = this.quizRepository.findByQuizUuid(quizUuid);
        List<Question> quizList = this.questionRepository.findListByQuizUuid(quizUuid);
        List<Answer> answerList = this.answerRepository.findListByQuizUuid(quizUuid);
        QuizWithQnaDto quizWithQnaDto = modelMapper.map(quiz, QuizWithQnaDto.class);
        System.out.println("test");
        return null;
    }

    @Override
    public int createQuiz(Quiz quiz) {
        return 0;
    }

    @Override
    public int updateQuiz(Quiz quiz) {
        return 0;
    }

    @Override
    public int deleteQuiz(String uuid) {
        return 0;
    }
}
