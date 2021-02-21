package com.company;

public abstract class Question {
    private String question;
    private static int nextQuestionNumber = 1;
    private int questionNumber;

    public Question() {
        questionNumber = nextQuestionNumber;
        nextQuestionNumber ++;
    }

    public Question(String question) {
        this.question = question;
        questionNumber = nextQuestionNumber;
        nextQuestionNumber ++;
    }

    public void askQuestion() {
        System.out.println(question);
    }



    public String getQuestion() {
        return question;
    }

}
