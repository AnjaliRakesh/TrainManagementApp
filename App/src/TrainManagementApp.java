import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a Set to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempt to add a duplicate bogie ID
        bogieIds.add("BG102");

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Display total number of unique bogies
        System.out.println("\nTotal unique bogie IDs: " + bogieIds.size());
    }
}