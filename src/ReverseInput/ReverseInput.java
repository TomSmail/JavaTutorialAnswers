package ReverseInput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;


public class ReverseInput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> myDeque = new ArrayDeque<>();
        String line = br.readLine();
        myDeque.push(line);
        while (!line.isEmpty()) {
            line = br.readLine();
            myDeque.push(line);
        }
        br.close();
        while (!myDeque.isEmpty()) {
            System.out.println(myDeque.pop());
        }
    }
}
