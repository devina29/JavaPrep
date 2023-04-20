import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunctionExample {

    /**
     * What is a function?
     * A function or method is a code block that takes some
     * argument as input and produces an output (optional).
     */

    /**
     * Main function
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Calculator myCal = new Calculator();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int firstNumber;
        int secondNumber;
        System.out.println("Enter first number : ");
        firstNumber = Integer.parseInt(br.readLine());
        System.out.println("Enter second number : ");
        secondNumber = Integer.parseInt(br.readLine());
        int result = myCal.sum(firstNumber, secondNumber);//function call
        System.out.println("The sum is : " + result);

        System.out.println("Enter a number to check if it is event or odd : ");
        int number = Integer.parseInt(br.readLine());
        myCal.checkEvenOdd(number);

        System.out.println("Enter a number to check if it is pos, neg or zero");
        int num = Integer.parseInt(br.readLine());
        myCal.checksPositiveOrNegative(num);

        String song = myCal.printSongLine();
        System.out.println(song);

        System.out.println("enter the first number ");
        int first = Integer.parseInt(br.readLine());
        System.out.println("enter the second number ");
        int second  = Integer.parseInt(br.readLine());
        System.out.println("enter the third number");
        int third = Integer.parseInt(br.readLine());
        int multiplication = myCal.multiply(first,second,third);
        System.out.println("the result is " + multiplication);


    }



}