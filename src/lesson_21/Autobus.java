package lesson_21;

public class Autobus {
    // Для создания связи типа HAS-A мы определяем поле класса,
    // которое будет хранить ссылку на объект другого класса

    private BusDriver driver; // агрегация (мягкая связь)
    private final AutoPilot autoPilot; // композиция (жесткая не разрывная связь)
    private int capacity;

    // Организовать связь пассажиров с автобусом. One-to-Many
    private final Passenger[] passengers; // список пассажиров, которые сейчас в автобусе
    private int countPassenger; // количество пассажиров в автобусе в данный момент. И заодно индекс массива?

    public Autobus(BusDriver busDriver, int capacity) {
        this.driver = busDriver;
        busDriver.setAutobus(this);
        autoPilot = new AutoPilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        // Надо проверить свободное место.
        // Если есть - добавить пассажира в автобус (в массив пассажиров)
        // возвратить boolean - дающий отчет об успешности посадки

        if (countPassenger < capacity) {
            // свободное место есть
            // добавляем пассажира в автобус
            passengers[countPassenger] = passenger;
            countPassenger++;
            System.out.println("Пассажир сел в автобус");
            return true;
        }
        System.out.println("Свободных мест нет");
        return false;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public String toString() {
        return "Autobus: {" + "driver: " + driver.getLicenseNumber() + "; autopilot: " + autoPilot.getSoftwareVersion() + "}";
    }

    public String getStringPassengersList() {
        // Перебрать список пассажиров. Приклеить к строке пассажира (в едином виде. id + name)
        // Т.к. пассажир ссылочный тип данных - приклеивать только не null ссылки
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];
                sb.append("Passsanger: {id: ").append(current.getId()).append("; namme: ").append(current.getName()).append("}");
                sb.append("; ");
            }
        }

        // Нам надо проверить - был ли добавлен хоть один пассажир.
        // Если был - отрезать 2 последних символа.
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");
        return sb.toString();
    }

}
