package control_flow.class_problems.assignment_problems.Week_5;

import java.util.Arrays;

public class CaptainMultiplier {

    static void applyMultipliers(double[] scores, int captain, int viceCaptain) {

        scores[captain] = scores[captain] * 2;
        scores[viceCaptain] = scores[viceCaptain] * 1.5;
    }

    public static void main(String[] args) {

        double[] scores = {40, 55, 30, 62};

        applyMultipliers(scores, 1, 3);

        System.out.println(Arrays.toString(scores));
    }
}