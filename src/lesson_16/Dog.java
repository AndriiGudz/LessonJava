package lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Я ем вкусную косточку");
        weight++;
    }

    void run() {

//        Проверяем - позволяет ли вес собаке бегать сейчас
//        если нет - отправить ее поесть.
//        После еды - проверить пункт 1.
//        цикл?

        while (weight < 3) {
            System.out.println("Я слишком худая и голодная. Бежать не могу...");
            System.out.println("Мой вес: " + weight + ". Надо поесть!");
            eat();
        }

        System.out.println("Я бегу");
        weight -= 2;
    }

    String whoAmI() {
        return "I am dog: " + this.name + " my weight: " + this.weight;
    }


}
