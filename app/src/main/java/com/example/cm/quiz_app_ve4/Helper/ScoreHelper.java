package com.example.cm.quiz_app_ve4.Helper;

public abstract class ScoreHelper {
    private static int score;

    public static void initScore() {
        score = 0;
    }

    public static void increment() {
        score++;
    }

    public static int getScore() {
        return score;
    }
}
