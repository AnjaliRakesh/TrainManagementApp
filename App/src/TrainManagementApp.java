import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {

        String[] bogieTypes = {
                "Sleeper",
                "First Class",
                "AC Chair",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        Arrays.sort(bogieTypes);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}