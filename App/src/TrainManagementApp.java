public class TrainManagementApp {

    public static void main(String[] args) {

        int[] capacities = {72, 24, 50, 90, 36};

        System.out.println("Before Sorting:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
    }
}