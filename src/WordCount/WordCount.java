package WordCount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class WordCount {


    private static int lineCount = 0;
    private static int wordCount = 0;
    private static int charCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
         do {
             line = br.readLine();
             lineCount ++;
             StringBuilder newLine = new StringBuilder();
             for (String character : line.split("")) {
                 if (!character.isEmpty()) {
                     if (checkIfAlphaNumeric(character.charAt(0))) {
                         newLine.append(character);
                     } else {
                         newLine.append(" ");
                     }
                 }
             }

             wordCount += Arrays.stream(newLine.toString().split(" "))
                     .filter(word -> !Objects.equals(word, ""))
                     .map(word -> word.replace(" ", ""))
                     .map(word -> charCount += word.length())
                     .toList()
                     .size();

        } while (!line.isEmpty());

//      makes up for the added line when the enter button is pressed
        System.out.println("Lines: " + (lineCount - 1));
        System.out.println("Words: " + wordCount);
        System.out.println("Characters :" + charCount);
    }

    public static boolean checkIfAlphaNumeric(char character) {
        return ((character >= '0' && character <= '9')
                || (character >= 'a' && character <= 'z')
                || (character >= 'A' && character <= 'Z'));
    }
}
