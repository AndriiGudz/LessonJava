package homework_20;
/*
Добавьте в класс поле, хранящее общее количество перевезенных автобусом пассажиров.
Геттер для этого поля. Нужен ли сеттер? Должны ли мы в каком-то из существующих методов
изменять количество перевезенных автобусом пассажиров? Если да - реализуйте.

Я считаю, что не нужен сеттер для поля, которое хранит общее количество пассажиров,
потому что мы не должны иметь возможности влиять на этот счетчик.
 */

public class Bus extends Vehicle {
    private int capacity;
    private int countPassengers;
    private int totalPassenger; // общее количество пассажиров, перевезенных этим, конкретным автобусом.
//    private static int totalPassenger; // общее количество пассажиров, перевезенных ВСЕМИ автобусами. Static - не принадлежит не кому!!!

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
            totalPassenger++;
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

    public int getTotalPassenger () {
        return totalPassenger;
    }


}
