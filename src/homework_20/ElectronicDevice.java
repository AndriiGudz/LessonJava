package homework_20;
/*
Написать как минимум одну иерархию классов в которой будет один родительский клас
и два наследника, расширяющих его функционал.
Лучше придумать две такие иерархии.
У всех классов должен быть метод создающий строку с информацией об объекте (метод String info())
 */

public class ElectronicDevice {
    private String manufacturer;
    private String model;
    private int year;

    public ElectronicDevice(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String info() {
        System.out.println("Производитель: " + manufacturer + " | Модель: " + model + " | Год выпуска: " + year);
        return null;
    }
}
