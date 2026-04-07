import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Food"));
        goodsBogies.add(new GoodsBogie("Flat", "Vehicles"));

        // Safety compliance check
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equals("Cylindrical")
                                || bogie.cargo.equals("Petroleum"));

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is safety compliant.");
        } else {
            System.out.println("\nTrain is NOT safety compliant.");
        }
    }
}