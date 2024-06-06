import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final VolvoFactory volvoFactory = new VolvoFactory();
    private final SkodaFactory skodaFactory = new SkodaFactory();
    private final HyundaiFactory hyundaiFactory = new HyundaiFactory();

    public void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Minimum distance in km: ");
        Integer minDistance = scanner.nextInt();

        System.out.println("Buses number: ");
        Integer buses = scanner.nextInt();

        System.out.println("Trams number: ");
        Integer trams = scanner.nextInt();

        System.out.println("Trolleys number: ");
        Integer trolleys = scanner.nextInt();


        ArrayList<Bus> volvo_buses = new ArrayList<>();
        for (int i = 0; i < buses; i++) {
            volvo_buses.add(volvoFactory.createBus());
        }
        ArrayList<Tramway> volvo_tramways = new ArrayList<>();
        for (int i = 0; i < trams; i++) {
            volvo_tramways.add(volvoFactory.createTramway());
        }
        ArrayList<Trolleybus> volvo_trolleys = new ArrayList<>();
        for (int i = 0; i < trolleys; i++) {
            volvo_trolleys.add(volvoFactory.createTrolleybus());
        }


        ArrayList<Bus> skoda_buses = new ArrayList<>();
        for (int i = 0; i < buses; i++) {
            skoda_buses.add(skodaFactory.createBus());
        }
        ArrayList<Tramway> skoda_tramways = new ArrayList<>();
        for (int i = 0; i < trams; i++) {
            skoda_tramways.add(skodaFactory.createTramway());
        }
        ArrayList<Trolleybus> skoda_trolleys = new ArrayList<>();
        for (int i = 0; i < trolleys; i++) {
            skoda_trolleys.add(skodaFactory.createTrolleybus());
        }


        ArrayList<Bus> hyundai_buses = new ArrayList<>();
        for (int i = 0; i < buses; i++) {
            hyundai_buses.add(hyundaiFactory.createBus());
        }
        ArrayList<Tramway> hyundai_tramways = new ArrayList<>();
        for (int i = 0; i < trams; i++) {
            hyundai_tramways.add(hyundaiFactory.createTramway());
        }
        ArrayList<Trolleybus> hyundai_trolleys = new ArrayList<>();
        for (int i = 0; i < trolleys; i++) {
            hyundai_trolleys.add(hyundaiFactory.createTrolleybus());
        }

        Integer volvo_cost = busCost(volvo_buses, minDistance) + tramCost(volvo_tramways, minDistance) + trolleyCost(volvo_trolleys, minDistance);
        Integer skoda_cost = busCost(skoda_buses, minDistance) + tramCost(skoda_tramways, minDistance) + trolleyCost(skoda_trolleys, minDistance);
        Integer hyundai_cost = busCost(hyundai_buses, minDistance) + tramCost(hyundai_tramways, minDistance) + trolleyCost(hyundai_trolleys, minDistance);

        if (volvo_cost < skoda_cost && volvo_cost < hyundai_cost) {
            System.out.println("Volvo is the best");
        } else if (skoda_cost < volvo_cost && skoda_cost < hyundai_cost) {
            System.out.println("Skoda is the best");
        } else {
            System.out.println("Hyundai is the best");
        }
    }

    private Integer busCost(ArrayList<Bus> buses, Integer distance) {
        Integer cost = 0;
        for (Bus bus : buses) {
            cost += bus.getVehicleCost() + bus.getCostPerKm(distance);
        }
        return cost;
    }

    private Integer tramCost(ArrayList<Tramway> trams, Integer distance) {
        Integer cost = 0;
        for (Tramway tram : trams) {
            cost += tram.getVehicleCost() + tram.getCostPerKm(distance);
        }
        return cost;
    }

    private Integer trolleyCost(ArrayList<Trolleybus> trolleys, Integer distance) {
        Integer cost = 0;
        for (Trolleybus trolley : trolleys) {
            cost += trolley.getVehicleCost() + trolley.getCostPerKm(distance);
        }
        return cost;
    }
}