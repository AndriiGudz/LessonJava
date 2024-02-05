package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
//        Значения по умолчанию для полей
//        ссылочные типы данных - null
//        числовые примитивы 0 (0.0)
//        boolean - false

        Cat cat = new Cat(); // создаем объект класса Cat
        // Cat() - сдесть происходит вызов конструктора класса

        cat.sayMeow();
        cat.run();
        cat.sleep();

        // При создании объекта класса, все его поля инициализруются значениями по умолчанию
        // За инициализацию отвечает конструктор

        String catNameVar = cat.name;
        System.out.println("Имя кота: " + catNameVar);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цвет кота: " + cat.color);


        System.out.println("==================================");
        // Создаем еще один объект класса Cat

        Cat cat1 = new Cat("Max");

        cat1.run();
        cat1.sleep();
        System.out.println("Имя кота1: " + cat1.name);
        System.out.println("Возраст кота1: " + cat1.age);

        System.out.println("Имя первого кота: " + cat.name);

        System.out.println("==================================");
        cat.whoAmI();
        cat1.whoAmI();


    }
}
