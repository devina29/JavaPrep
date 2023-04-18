import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        /* Scanner Input */
        Scanner x = new Scanner(System.in); // What is constructor?
        System.out.println("Enter your Name ");
        String name = x.nextLine();
        System.out.println("Your name is : " + name);

/* Buffered Reader Input */
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader(inputStreamReader);
       System.out.println("Please Enter another String ");
        String reader = s.readLine();
        System.out.println("The input given is : " + reader);

    }
}
