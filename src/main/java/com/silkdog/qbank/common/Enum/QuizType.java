package com.silkdog.qbank.common.Enum;

/**
 * @author: aikoc
 * @date: 2021-09-18
 * @description: 문제유형 Enum
 * @note:
 * */
public enum QuizType {
    CHOICE(1),
    SINGLELINE(2),
    MULTILINE(3);

    public final int numeric;

    QuizType(int numeric) {
        this.numeric = numeric;
    }
}
