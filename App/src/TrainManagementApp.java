import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create sample bogies
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("Bogie-" + i, i % 100));
        }

        // Loop-based filtering
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.capacity > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // Stream-based filtering
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // Display timing results
        System.out.println("\nLoop Filtering Time   : " + loopTime + " ns");
        System.out.println("Stream Filtering Time : " + streamTime + " ns");
    }
}