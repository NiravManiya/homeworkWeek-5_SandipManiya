package homework_week_9;

import java.util.HashSet;

public class Programme8_HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> set = new HashSet<>();

        // Store the numbers 4, 7, and 8 to the set
        set.add(4);
        set.add(7);
        set.add(8);

        // Show which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 that are in the set:");
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is present in the set.");
            } else {
                System.out.println(i + " is not present in the set.");
            }
        }
    }
}
