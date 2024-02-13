package homework_20;

public class BusMain {
    public static void main(String[] args) {
        Bus bus = new Bus("Man", 2020, 10);
        bus.go();
        bus.stop();

        System.out.println("Вместимость автобуса: " + bus.getCapacity());

        System.out.println(" \n ======================= \n");
        bus.takePassenger();
        bus.getOutPassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.getOutPassenger();
        bus.takePassenger();

        System.out.println("Количество пассажиров в автобусе в данный момент: " + bus.getCountPassengers());
        System.out.println("За всё время в автобусе проехало человек: " + bus.getTotalPassenger());
    }
}
