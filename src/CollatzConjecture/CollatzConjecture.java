package CollatzConjecture;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {

    public static void main(String[] args) {
        int startingValue = Integer.parseInt(args[0]);
        List<Integer> numberList = new ArrayList<Integer>();
        while (startingValue != 1) {
            System.out.print(startingValue + " ");
            numberList.add(startingValue);
            startingValue = next(startingValue);
        }
//        System.out.printf(String.valueOf(numberList));
    }

    private static int next(int x) {
        if (x % 2 == 0) {
            return x / 2;
        } else {
            return 3 * x + 1;
        }
    }
}
