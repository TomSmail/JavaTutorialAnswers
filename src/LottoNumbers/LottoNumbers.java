package LottoNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumbers {
    private static Random generator;
    private static List<Integer> previousNumbers = new ArrayList<Integer>();
    private static final int NUM_LOTTO_BALLS = 7;
    private static final int LARGEST_LOTTO_BALL = 49;

    public static void main(String[] args) {
        generator = new Random();
        for (int i = 1; i <= NUM_LOTTO_BALLS; i++ ) {
            if (i != NUM_LOTTO_BALLS) {
                System.out.println("Number " + i + ": " + generateNewNumber());
            } else {
                System.out.println("Bonus Number: " + generateNewNumber());
            }
        }
    }
    public static Integer generateNewNumber() {
        int nextInt = generator.nextInt(LARGEST_LOTTO_BALL);
        while (previousNumbers.contains(nextInt)) {
            nextInt = generator.nextInt(LARGEST_LOTTO_BALL);
        }
        previousNumbers.add(nextInt);
        return nextInt;
    }
}
