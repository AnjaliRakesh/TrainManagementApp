class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Passenger Bogie Type: " + type + ", Capacity: " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        try {
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
            System.out.println(bogie1);

            PassengerBogie bogie2 = new PassengerBogie("AC Chair", 0);
            System.out.println(bogie2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}