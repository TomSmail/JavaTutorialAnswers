package PerfectPalidromicCubes;

import java.util.*;

public class PalindromicCubes {

    private static final int MAX_X_VALUE = 1500;
    public static void main(String[] args) {
        System.out.println();
        Map<Integer, Integer> palindromicMap = generatePalidromicIntegers();
        List<Integer> listOfPalindromes = new ArrayList<Integer>(palindromicMap.keySet());
        Collections.sort(listOfPalindromes);
        for (Integer i: listOfPalindromes) {
            System.out.println(i + " cubed is " + palindromicMap.get(i));
        }
        System.out.println();

    }

    private static Map<Integer, Integer> generatePalidromicIntegers() {
        Map<Integer, Integer> palidromeMap = new HashMap<Integer, Integer>();
        for (int i = 0; i <= MAX_X_VALUE ; i ++ ) {
            int cube = i * i * i;
            if (isPalidrom(cube)) {
                palidromeMap.put(i, cube);
            }
        }
        return palidromeMap;
    }

    private static Boolean isPalidrom(int x){
        StringBuffer sbf1 = new StringBuffer();
        sbf1.append(x);
        sbf1.reverse();
        return sbf1.toString().equals(Integer.toString(x));
    }

}
