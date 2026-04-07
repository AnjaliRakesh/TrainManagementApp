import java.util.LinkedHashSet;

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Duplicate bogie
        trainFormation.add("Sleeper");

        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);
    }
}