package homework_week_9;

import java.util.ArrayList;

public class Programme6_RetrieveElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Retrieve element at index 2 (3rd element)
        int index = 2;
        if (index >= 0 && index < fruits.size()) {
            String element = fruits.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
