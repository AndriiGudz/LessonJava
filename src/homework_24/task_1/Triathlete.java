package homework_24.task_1;
/*
Создайте интерфейсы Swimmer и Runner с методами swim и run соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class Triathlete implements Swimmer, Runner {
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Триатлонист " + name + " бежит");
    }

    @Override
    public void swim() {
        System.out.println("Триатлонист " + name + " плывет");
    }

    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("Ivan");
        Triathlete triathlete1 = new Triathlete("Max");

        triathlete.run();
        triathlete.swim();
        System.out.println("\n================================\n");
        triathlete1.run();
        triathlete1.swim();
    }
}
