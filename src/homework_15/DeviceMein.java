package homework_15;

public class DeviceMein {
    public static void main(String[] args) {

//        Создание 1 объекта класса Device
        Device device = new Device();

        device.internet();
        device.call();
        device.storeData();

//        Создание 2 объекта класса Device
        System.out.println("\n================================\n");
        Device device1 = new Device();
        device1.type = "Laptop";
        device1.brand = "Lenovo";
        device1.memory = 250;
        device1.screen = 14.1;

        System.out.println("Тип устройства: " + device1.type);
        System.out.println("Название бренда: " + device1.brand);
        System.out.println("Объем памяти: " + device1.memory);
        System.out.println("Диагональ экрана: " + device1.screen);

        device1.internet();
        device1.storeData();

    }
}
