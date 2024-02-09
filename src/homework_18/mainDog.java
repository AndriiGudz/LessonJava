package homework_18;

public class mainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Gerkules", 50);

        dog.info();

        dog.takeBarrier(80);

        System.out.println("\n=============================\n");

        Dog dog1 = new Dog("Korn", 44);
        dog1.info();
        dog1.takeBarrier(85);

    }
}
