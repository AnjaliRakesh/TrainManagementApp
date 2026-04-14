class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            // Unsafe rule: Petroleum cannot be stored in rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Petroleum cannot be assigned to a Rectangular Goods Bogie"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);
        }

        catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Cargo assignment process completed.\n");
        }
    }

    @Override
    public String toString() {
        return "Goods Bogie Shape: " + shape + ", Cargo: " +
                (cargo == null ? "Not Assigned" : cargo);
    }
}

public class Main {
    public static void main(String[] args) {

        GoodsBogie bogie1 = new GoodsBogie("Rectangular");
        bogie1.assignCargo("Coal");

        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        GoodsBogie bogie3 = new GoodsBogie("Cylindrical");
        bogie3.assignCargo("Petroleum");

        System.out.println(bogie1);
        System.out.println(bogie2);
        System.out.println(bogie3);

        System.out.println("\nProgram continues safely after handling exception.");
    }
}