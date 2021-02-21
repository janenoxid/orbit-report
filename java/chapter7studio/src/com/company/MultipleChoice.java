package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> possibleAnswers;
    private String correctAnswer;


    public MultipleChoice(String question) {
        super(question);
    }

    public MultipleChoice(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public MultipleChoice(String question, ArrayList<String> possibleAnswers, String correctAnswer) {
        super(question);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }



}

