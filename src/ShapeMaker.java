public class ShapeMaker {
    /**
     * Write a method that takes shape as input and its dimension as input and returns area as output */

    public double area(String shape, int... dimension) {
        double calculatedArea;
        boolean checkSquare = shape.equals("square");
        boolean checkRect = shape.equals("rectangle");
        boolean checkTriangle = shape.equals("triangle");
        if(checkSquare) {
            calculatedArea = dimension[0] * dimension[0];
            System.out.println("The shape is square");
        } else if (checkRect) {
            calculatedArea = dimension[0] * dimension[1];
            System.out.println("The shape is rectangle");

        } else if (checkTriangle) {
            int a = dimension[0];
            int b = dimension[1];
            int c = dimension[2];
            double s = (a + b + c) /2.0;
            double value = s * (s-a) * (s-b) * (s-c);
            calculatedArea = Math.sqrt(value);
            System.out.println("The shape is triangle");

        } else {
            System.out.println("The shape is invalid");
            calculatedArea = 0;

        }
        return calculatedArea;

    }

    /**
     * Write a method that prints triangle star and takes no of rows as input */

}


