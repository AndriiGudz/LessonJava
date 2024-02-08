package consultation;

import java.util.Scanner;

public class Auto {

    private String brand;
    private String model;
    private String color;

    public Auto(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void startTheEngine () {
        System.out.println("Двигатель завелся");
    }

    public void stopTheEngine () {
        System.out.println("Двигатель выключен");
    }

    public String createHonk () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вы хотите что бы машина сигналила");

        String honk = scanner.nextLine();

        return honk;
    }

    public void honk () {
        String honk = createHonk();
        System.out.println("Я сигналю: " + honk);
    }

}
