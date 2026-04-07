class InvalidCapacityException extends Exception {

    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String name;
    int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for bogie '" + name + "': " + capacity);
        }

        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated: " + sleeper);

            // Invalid bogie example
            PassengerBogie invalid = new PassengerBogie("Broken Coach", 0);
            System.out.println("Created: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely.");
    }
}