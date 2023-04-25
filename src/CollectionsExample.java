import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        Integer hindiMarks = Integer.valueOf("5");
        Integer mathMarks = Integer.valueOf("9");
        Integer engMarks = Integer.valueOf("10");
        Integer phyMarks = Integer.valueOf("15");
        Integer chemMarks = Integer.valueOf("8");
        ArrayList <Integer> result = new ArrayList <Integer> ();
        result.add(hindiMarks);
        result.add(mathMarks);
        result.add(engMarks);
        result.add(phyMarks);
        result.add(chemMarks);
        System.out.println(result);
        int firstElement = result.get(2);
        System.out.println(firstElement);



        Bird myBird = new Bird();

    }

}