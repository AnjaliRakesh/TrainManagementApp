import java.util.ArrayList;

public class TrainManagementApp {

    public static void main(String[] args) {

        ArrayList<String> bogieIds = new ArrayList<>();

        String searchId = "BG101";

        try {

            // Defensive check before search
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException(
                        "Cannot perform search. No bogies are available in the train."
                );
            }

            boolean found = false;

            for (String id : bogieIds) {

                if (id.equals(searchId)) {
                    found = true;
                    System.out.println("Bogie found: " + id);
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}