import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println(" Enter a number");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int i;
        for(i = 1; i <= 10; i++) {
            System.out.println(number + "X" + i  + "=" + number * i);
        }



    }
}
