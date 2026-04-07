import java.util.ArrayList;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger bogies after removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of Sleeper bogie
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train consist.");
        } else {
            System.out.println("\nSleeper bogie does not exist in the train consist.");
        }

        // Final list state
        System.out.println("\nFinal train consist:");
        System.out.println(passengerBogies);
    }
}