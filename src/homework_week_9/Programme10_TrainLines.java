package homework_week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme10_TrainLines {
    public static void main(String[] args) {
        // Create a HashMap to store train lines and stations
        Map<String, String[]> trainLines = new HashMap<>();


        trainLines.put("Central Line", new String[]{"Oxford Circus", "Holborn", "Bank", "Bond Street", "Tottenham Court Road"});
        trainLines.put("Victoria Line", new String[]{"Oxford Circus", "Green Park", "Victoria", "Euston", "Warren Street"});
        trainLines.put("Northern Line", new String[]{"King's Cross St Pancras", "Euston", "Leicester Square", "Angel", "Moorgate"});
        trainLines.put("Jubilee Line", new String[]{"Waterloo", "Baker Street", "London Bridge", "Westminster", "Green Park"});

        // Ask the user to input a station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name: ");
        String stationName = scanner.nextLine().trim();

        // Check which train lines pass through the entered station
        boolean found = false;
        for (Map.Entry<String, String[]> entry : trainLines.entrySet()) {
            for (String station : entry.getValue()) {
                if (station.equalsIgnoreCase(stationName)) {
                    System.out.println("The " + entry.getKey() + " passes through " + stationName + ".");
                    found = true;
                    break;
                }
            }
        }

        // If no train line passes through the entered station
        if (!found) {
            System.out.println("No train line passes through " + stationName + ".");
        }

        scanner.close();
    }
}
