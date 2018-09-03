package us.kpatrick;

import java.util.ArrayList;

public class TestScores {

    public ArrayList scoreList;

    /**
     * Constructor for the Test scores class
     * @param testScores
     * @throws InvalidTestScores for any scores below 0 or above 100
     */
    public TestScores(ArrayList<Double> testScores) throws InvalidTestScores {

        for (double t : testScores){
            if (t<0 || t>100) {
                throw new InvalidTestScores("Invalid Test Scores were entered.");
            }
        }
        scoreList = testScores;
    }

    /**
     * calculate the Average score of all tests
     * @return double of the sum of scores divided by count of scores
     */
    public double AverageScore() {
        int j = 0;
        double  sum = 0;
        while (scoreList.size() > j) {
            sum += (double) scoreList.get(j);
            j++;
        }

        return (sum / scoreList.size());
    }

}
