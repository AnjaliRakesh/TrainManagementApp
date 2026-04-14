public class TrainManagementApp {

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG518"
        };

        String searchId = "BG309";
        boolean found = false;

        System.out.println("Searching for Bogie ID: " + searchId);

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchId)) {
                found = true;
                System.out.println("Bogie ID found at position " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }
    }
}