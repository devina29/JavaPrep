public class ShapeMaker {
    /**
     * Write a method that takes shape as input and its dimension as input and returns area as output
     */

    public double area(String shape, int... dimension) {
        double calculatedArea;
        boolean checkSquare = shape.equals("square");
        boolean checkRect = shape.equals("rectangle");
        boolean checkTriangle = shape.equals("triangle");
        if (checkSquare) {
            calculatedArea = dimension[0] * dimension[0];
            System.out.println("The shape is square");
        } else if (checkRect) {
            calculatedArea = dimension[0] * dimension[1];
            System.out.println("The shape is rectangle");

        } else if (checkTriangle) {
            int a = dimension[0];
            int b = dimension[1];
            int c = dimension[2];
            double s = (a + b + c) / 2.0;
            double value = s * (s - a) * (s - b) * (s - c);
            calculatedArea = Math.sqrt(value);
            System.out.println("The shape is triangle");

        } else {
            System.out.println("The shape is invalid");
            calculatedArea = 0;

        }
        return calculatedArea;

    }


    /**
     * Write a method that prints triangle star and takes no of rows as input
     * For input 4
     * ---------
     * <p>
     * *
     * * *
     * * * *
     * --------
     */

    public void triangleStar(int rows) {
        int i, j;
        for (i = 1; i <= rows; i++) {
            /* body start */

            for (j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
            /* Body end */
        }

    }


/**
 * Write a method that prints triangle numbers and takes no of rows as input
 1
 2 2
 3 3 3
 4 4 4 4
 */
public void triangleNumber(int rows) {
    int i, j;
    for(i = 1; i <= rows; i++){
        for(j = 1; j <= i; j++) {
            System.out.print(i + " " );

        }

        System.out.println();

    }
}

/** Write a method that takes a no as input and prints that no, that many times

 * input: 3, output: 3 3 3
 */
public void number( int no) {
    int i;
    for(i = 1; i <= no; i++) {
        System.out.print(no + " " );

    }
}
/** rows as input, if value of rows = 3, it should print it 3 times
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 10 11 12

 */
public void maze( int input) {
    int i,j;
    int noOfElementsInOneRow = 3;
    for( j = 1; j <= input;) {
        for( i = 1; i <=noOfElementsInOneRow; i++) {
            System.out.print( j + " ");
            j++;

        }
        System.out.println();

    }











}
}




