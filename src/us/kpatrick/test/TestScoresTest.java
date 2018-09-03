package us.kpatrick.test;

import us.kpatrick.TestScores;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestScoresTest {

    TestScores t;

    @org.junit.Before
    public void setUp() throws Exception {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(20.0);
        scores.add(40.0);
        scores.add(160.0);
        t = new TestScores(scores);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void averageScore() {
        assertTrue("Correct",t.AverageScore() == 40.0 );
        assertFalse("Incorrect",t.AverageScore() == 53.45);
    }
}