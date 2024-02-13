package lesson_20;

public class Bus extends Vehicle {
    private int capacity;
    private int countPassengers;

    public Bus(String model, int yearManufactured, int capacity) {
        // чтобы создать объект - родителя, нам нужно вызвать конструктор!
        super(model, yearManufactured); // вызов кунструктора родителя
        System.out.println("Конструктор Bus start");
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        // Проверить есть ли место в автобусе
        if (countPassengers < capacity) {
            // свободное место есть. Добавляем пассажира
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }
        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }

    public void getOutPassenger() {
        // проверить, а есть ли пассажиры в автобусе
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса");
        } else {
            System.out.println("Некому выходить. В автобусе больше нет пассажиров");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        // TODO нужно проверять!!!
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
