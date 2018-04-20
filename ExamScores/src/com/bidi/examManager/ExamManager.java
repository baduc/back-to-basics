package com.bidi.examManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExamManager {

    private List<Double> scores;

    public ExamManager() {
        scores = new ArrayList<>();
        scores.add(78.3);
        scores.add(49.1);
        scores.add(16.5);
        scores.add(23d);
        scores.add(18.8);
    }

    public Double customCalculation(Function<List<Double>, Double> calculator) {
        return calculator.apply(scores);
    }

    public void printScores() {
        scores.forEach(score -> System.out.println(score));
    }

    public void printSelectedScore(Predicate<Double> condition) {
        scores.forEach(score -> {
            if (condition.test(score)) {
                System.out.println(score);
            }
        });
    }

    public List<Double> getSortedList() {
        List<Double> result = new ArrayList<>();
        scores.forEach(score -> result.add(score));
        result.sort((a, b) -> {
            return b.compareTo(a);
        });
        return result;
    }

    public void printSorted() {
        scores.sort((a, b) -> {
            return a.compareTo(b);
        });
        printScores();
    }
}
