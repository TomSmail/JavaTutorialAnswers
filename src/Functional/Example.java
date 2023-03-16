package Functional;

import java.util.List;

public class Example {
    public static List reverseEachString(List<String> input) {
        return input.stream().map(Example::reverse).toList();
    }

    private static String reverse( String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    public static List<String> sqrtsOfFirstDigits(List<String> input) {
        System.out.println("9".charAt(0));
        return input.stream().filter(x -> Character.isDigit(x.charAt(0)))
                .map(x -> String.valueOf(Math.sqrt(x.charAt(0)))).toList();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachString(List.of("Hello!", "My", "JAMEIES")));
        System.out.println(sqrtsOfFirstDigits(List.of("9Hello!", "4My", "JAMEIES")));
    }



}
