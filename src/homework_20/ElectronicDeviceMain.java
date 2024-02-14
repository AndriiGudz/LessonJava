package homework_20;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = new ElectronicDevice("Samsung", "A10", 2021);
        System.out.println(electronicDevice.info());

        System.out.println("==============================");

        Storage storage = new Storage("SSD");
        Laptop laptop = new Laptop("Lenovo", "ThinkPad", 2022, "TFT", 13.2, 250, storage);
        System.out.println(laptop.info());


        System.out.println("==============================");

        Printer printer = new Printer("Canon", "i-SENSYS MF3010", 2011, "МФУ", "USB, Ethernet", "A4");
        System.out.println(printer.info());

    }
}
