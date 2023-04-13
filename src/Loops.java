public class Loops {
    public static void main(String[] args) {
        /**
         * for loop
         */
        int i;
        for (i = 0;
             i < 10;
             i = i + 1) {
            System.out.println(i + 1 + ". " + "Happiness");
        }
        for (i = 10; i > 0; i = i - 1) {
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
        } while (i < 10);

/** Practice Ques
 1
 1 2
 1 2 3
 1 2 3 4
 */
        System.out.println("-------");
        int rows = 10;
        int r = 1;
        int lineCount;
        for (r = 1; r <= rows; r++) {
            for(lineCount = 1; lineCount <= r; lineCount++) {
                System.out.print(lineCount + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        /**
         1
         2 2
         3 3 3
         4 4 4 4
         *
         */
        int x = 4;
        int pattern = 1;
        for(x = 1; x <= 4; x++) {
            for(pattern = 1; pattern <= x; pattern++) {
                System.out.print (x + " ");
            }
            System.out.println();
        }

    }


}

