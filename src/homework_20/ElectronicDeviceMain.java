package homework_20;

public class ElectronicDeviceMain {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = new ElectronicDevice("Samsung", "A10", 2021);
        electronicDevice.info();

        System.out.println("==============================");

        Laptop laptop = new Laptop("Lenovo", "ThinkPad", 2022, "TFT", 13.2, 250);
        laptop.info();

        System.out.println("==============================");

        Printer printer = new Printer("Canon", "i-SENSYS MF3010", 2011, "МФУ", "USB, Ethernet", "A4");
        printer.info();
    }
}
