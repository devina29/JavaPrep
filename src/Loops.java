public class Loops {
    public static void main(String[] args) {
        /**
         * for loop
         */
        int i;
        for(i = 0;
            i < 10;
            i = i + 1 ) {
            System.out.println(i + 1 + ". " + "Happiness");
        }
        for(i = 10; i > 0; i = i - 1 ) {
            System.out.println(i);
        }
        System.out.println("using multiply");
        for (i = 1; i < 8; i = i * 2) {
            System.out.println(i);
        }
        /**
         * while loop
         */
        System.out.println("while loop");
        i = 0;
        while (i < 10) {
            System.out.println(i + "Testing while loop");
            i = i + 1;
        }
        /**
         * do-while
         */
        i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        } while ( i < 10);


    }


}
