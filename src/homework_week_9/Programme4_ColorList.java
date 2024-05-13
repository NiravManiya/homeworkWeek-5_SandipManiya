package homework_week_9;

import java.util.ArrayList;

public class Programme4_ColorList {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
