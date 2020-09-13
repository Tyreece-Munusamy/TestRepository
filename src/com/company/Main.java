package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What colour is the sky? \n a) blue \n b) green \n c) purple \n d) gold";
        String q2 = "How big is the house? \n a) large \n b) small \n c) extra large \n d) medium";

        Question[] questions = {
                new Question(q1,"a"),
                new Question(q2,"c")
        };
        answerQuestions(questions);
    }
    public static void answerQuestions(Question[] questions) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(question.getAnswer())) {
                score++;
            }
        }
        System.out.println("You achieved " + score + "/" + questions.length);
    }

}
