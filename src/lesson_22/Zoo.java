package lesson_22;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Hamster hamster = new Hamster();
        hamster.voice();

        Dog dog = new Dog();
        dog.voice();

        // Переопределение методов
        // Method Overriding - динамический полиморфизм - времени выполнения (Runtime)

        // Статический полиморфизм (компиляционный) - перегрузка метода

        System.out.println(animal);
        System.out.println(hamster);

    }
}
