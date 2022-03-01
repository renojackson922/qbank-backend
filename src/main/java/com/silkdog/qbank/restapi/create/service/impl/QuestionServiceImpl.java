package com.silkdog.qbank.restapi.create.service.impl;

import com.silkdog.qbank.common.Config.CustomModelMapper;
import com.silkdog.qbank.restapi.common.domain.QuestionAndAnswerDto;
import com.silkdog.qbank.restapi.common.entity.Answer;
import com.silkdog.qbank.restapi.common.entity.Question;
import com.silkdog.qbank.restapi.common.entity.Quiz;
import com.silkdog.qbank.restapi.common.repository.AnswerRepository;
import com.silkdog.qbank.restapi.common.repository.QuestionRepository;
import com.silkdog.qbank.restapi.common.repository.QuizRepository;
import com.silkdog.qbank.restapi.create.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final CustomModelMapper customModelMapper;
    private final QuizRepository quizRepository;
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    // FIXME: Exception 재정의
    @Override
    public int insertQuestion(String quizUuid, QuestionAndAnswerDto qna) throws Exception {
        System.out.println(quizUuid);
        Quiz currentQuiz = quizRepository.findByQuizUuid(quizUuid);
        System.out.println(currentQuiz);
        if (currentQuiz != null) {
            saveQuizAnswerTransactional(qna);
            return 1;
        } else {
            throw new Exception("invalid quiz");
        }
    }

    @Transactional
    void saveQuizAnswerTransactional(QuestionAndAnswerDto qna) {
        ModelMapper modelMapper = customModelMapper.standardMapper();
        questionRepository.save(modelMapper.map(qna.getQuestionDto(), Question.class));
        answerRepository.save(modelMapper.map(qna.getAnswerDto(), Answer.class));
    }

}
