import java.sql.SQLOutput;

public class ExceptionHandling {
    public static void main(String[] args) {
        /**
         * Try, Catch, Finally
         */
        try {
            /* Do Dangerous Stuff */
            /* Try is always followed by Catch */
            String validNo = "50";
            String invalidNo = "abc";
            int actualNo = Integer.parseInt(invalidNo);
            System.out.println("actual no is : " + actualNo);
        } catch(Exception mishap) {
            /* Gracefully do something else */
            /* We have nested Catch */
            System.out.println("Something went wrong " + mishap);

        } finally {
            /* Do this for sure */
            /* Finally is optional */
            System.out.println("Closing Program");


        }
    }
}

