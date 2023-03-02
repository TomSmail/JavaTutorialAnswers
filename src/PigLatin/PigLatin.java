package PigLatin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {

    final static String  PUNCTUATION = ".?,";
    final static String VOWELS = "aeiou";


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");
        System.out.println(Arrays.stream(words)
                .map(word -> new ArrayList(List.of(word.split(PUNCTUATION))))
                .map(wordsAndPunc -> { if (VOWELS.contains(wordsAndPunc.get(0).toString().substring(0,1))) {
                    ArrayList newWords = wordsAndPunc;
                    wordsAndPunc.remove(0);
                    wordsAndPunc.add(newWords.get(0).toString().concat("way"));
                    return wordsAndPunc.stream().flatMap(x -> x instanceof String ? Stream.of(x) : ((List) x).stream()).collect(Collectors.toList());
                }
                else {
                    return wordsAndPunc;
                }
                }));

    }
}
