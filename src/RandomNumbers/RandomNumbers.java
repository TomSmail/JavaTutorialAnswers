package RandomNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    private static final List<Integer> previousValues = new ArrayList<Integer>();
    private static Random generator;

    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        generator = new Random();
        int x = generator.nextInt(0,y);
        while (!checkIfAllValuesDisplayed(y)) {
            previousValues.add(x);
            x = generator.nextInt(y);
        }
        System.out.println("Generating random numbers:");
        StringBuffer sb = new StringBuffer();
        for (int i : previousValues) {
            sb.append(i).append(", ");
        }
        System.out.println(sb);
        System.out.println("I had to generate " + previousValues.size()
                + " random numbers between 0 and " + (y-1)
                + " to have produced all such numbers at least once.");


    }
    private static Boolean checkIfAllValuesDisplayed(int y) {
        for (int i = 0; i < y; i++){
            if (!previousValues.contains(i)) {
                return false;
            }
        }
        return true;
    }

}
