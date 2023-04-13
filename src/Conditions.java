import org.w3c.dom.ls.LSOutput;

public class Conditions {
    public static void main(String[] args) {
        int i = 0;
        if(i > 0) {
            System.out.println("i is positive");
        } else {
            System.out.println("i is negative");
        }

        if(i > 0) {
            System.out.println("i is positive");
        } else if (i < 0) {
            System.out.println("i is negative");

        } else{
            System.out.println("i is zero");
        }

        int month = 20;
        if(month == 1) {
            System.out.println("January");
        } else if(month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");

        } else{
            System.out.println( "Invalid month");
        }
        System.out.println("-----------");
        int daysOfWeek = 7;
        switch (daysOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");

        }
        System.out.println("Ternary operator");
        String result;
        result = daysOfWeek < 8 ? "Valid Input" :"Invalid input";
        System.out.println(result);


    }
}
