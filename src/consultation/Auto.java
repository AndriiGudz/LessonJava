package consultation;

import java.util.Scanner;

public class Auto {

    String brand;
    String model;
    String color;

    public Auto(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
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
