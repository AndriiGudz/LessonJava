package lesson_20;

public class TransportMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Телега", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();

        System.out.println("\n===============================\n");

        Bus bus = new Bus("Man", 2020, 3);
        System.out.println(bus.toString());
        bus.go();
        bus.stop();

        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println("\n=======================================\n");
        bus.getOutPassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        System.out.println("bus.getCountPassengers(): " + bus.getCountPassengers());
        bus.takePassenger();

        System.out.println("\n=======================================\n");
        Train train = new Train("ICE-1046", 2024, 3);
        System.out.println(train.toString());
        train.go();
        train.stop();

        System.out.println(train.getWagonCounter());

        System.out.println("\n=======================================\n");

        SpecialBus specialBus = new SpecialBus("Ikarus", 1978, 30, 3);
        specialBus.go();
        System.out.println(specialBus.toString());
        specialBus.takePassenger();
        specialBus.getOutPassenger();
        specialBus.getOutPassenger();

        System.out.println(specialBus.example());


    }
}
