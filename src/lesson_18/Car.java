package lesson_18;

public class Car {

    static int countCar;
    private String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public void info() {
        System.out.println("Car: " + this.model + " | power = " + this.powerPS + " | создана машинка: " + countCar);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        car.info();
        Car car1 = new Car("VW", 300);
        car1.info();
        Car car2 = new Car("Ford", 75);
        car2.info();


        System.out.println("Всего создано автомобилей: " + Car.countCar);

    }

}
