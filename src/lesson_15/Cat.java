package lesson_15;

public class Cat {
//    У кота есть имя, цвет и возраст -> это переменные/ поля класса
//    Кот может мяукать, спать, бежать -> это методы

    String name;
    String color;
    int age;

    public Cat() { // вид конструктора по умолчанию
//       !!! нужно обязательно прописать, если планируем перегружать метод !!!
        System.out.println("Конструктор 1");
    }

    // Перегруженный конструктор
    public Cat(String catName) {
        System.out.println("Конструктор 2");
        name = catName;
    }

    public void whoAmI() {
        System.out.println("Я котик " + name + ", мой возраст: " + age + ", мой цвет: " + color);
    }

    void sleep() {
        System.out.println("Я сплю");
    }

    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void run() {
        System.out.println("Run");
    }

}
