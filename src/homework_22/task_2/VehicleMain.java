package homework_22.task_2;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle motorcycle = new Motorcycle();
        Vehicle car = new Car();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = bicycle;
        vehicles[1] = motorcycle;
        vehicles[2] = car;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].starEngine();
        }
    }
}
