package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5_ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get an Iterator object for the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate through the elements using the Iterator
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
