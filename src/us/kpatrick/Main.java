package us.kpatrick;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Main Application for Calculating given test scores as an array list
 * @author kpatr
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) throws InvalidTestScores {
	// write your code here
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(20.0);
        scores.add(40.0);
        scores.add(60.0);

        TestScores t = null;
        try {
            t = new TestScores(scores);
        } catch (InvalidTestScores e) {
            System.out.println(e.getMessage());
        }

        System.out.println(t.AverageScore());


    }
}
