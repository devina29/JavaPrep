public class DataTypes {
    public static void main(String[] args) {
        /**
         * Primitive
         * byte, short, int, long, float, double, boolean and char
         * Non-Primitive
         * String, Arrays and Classes
         *
         * 1. used to define how much size is needed to store the data
         * 2. used to define what operations are allowed on the data.
         */
        byte marks; // 1 byte or 8 bits. Range -128 to 127
        short numberOfCities; // 2 byte. Range -32768 to 32767
        int population; // 4 byte. -2147483648 to 2147483647
        long startsInUniverse; // 8 byte
        float valueOfPie;
        double veryPreciseDecimalNumber;
        boolean trueOrFalse;
        char letter; //2 byte
        String name; // bunch of characters stuck together.

        byte englishMarks = 89;
        byte mathMarks = 90;

        byte hindiMarks = 78;

        byte [] result = new byte[5]; //byte array of 5 elements.
        int [] worldPopulation = new int[10]; //total 40 bytes. 10 elements of 4 byte each.

        result[0] = 89;
        result[1] = 90;
        result[2] = 78;
        System.out.println("English Marks : " + result[0]);

    }












}
