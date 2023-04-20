public class ConstructorExample {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car(); //Default Constructor
        myCar.setOwnerName("Devina");

        /**
         * 1. We created a new object of type Car and named it myCar
         * 2. To create the object of type Car we have used default constructor
         */
        Car atulsCar;
        atulsCar = new Car("Atul");
        System.out.println(myCar.getOwnerName());
        System.out.println(atulsCar.getOwnerName());

    }
}
