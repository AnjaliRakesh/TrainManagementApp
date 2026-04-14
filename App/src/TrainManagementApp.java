public class TrainManagementApp {

    public static void main(String[] args) {

        // Sorted bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG518"
        };

        String searchId = "BG412";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("Bogie ID found at position " + mid);
                found = true;
                break;
            }
            else if (result < 0) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Bogie ID not found.");
        }
    }
}