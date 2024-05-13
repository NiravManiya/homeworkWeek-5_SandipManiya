package homework_week_9;

import java.util.HashMap;

public class Programme9_HashMapIteration {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the HashMap
        people.put("John", 25);
        people.put("Alice", 30);
        people.put("Bob", 35);
        people.put("Emma", 28);

        // Iterate over the values in the HashMap using a for-each loop
        System.out.println("Values in the HashMap:");
        for (Integer age : people.values()) {
            System.out.println(age);
        }
    }
}
