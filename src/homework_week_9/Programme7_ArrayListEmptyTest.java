package homework_week_9;

import java.util.ArrayList;

public class Programme7_ArrayListEmptyTest {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Check if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");

        // Check again if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
