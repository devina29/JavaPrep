public class ShapeTest {
    public static void main(String[] args) {
        ShapeMaker shapeMakerObjectName = new ShapeMaker();
        double result = shapeMakerObjectName.area("square",4);
        double result1 =  shapeMakerObjectName.area("rectangle", 2, 4);
        double result2 = shapeMakerObjectName.area("triangle", 3, 3, 3);
        System.out.println("Square area is " + result);
        System.out.println("Rectangle area is " + result1);
        System.out.println("Triangle area is " + result2);
        shapeMakerObjectName.triangleStar( 4);
        shapeMakerObjectName.triangleNumber(7);
        shapeMakerObjectName.maze(12 );

    }
}
