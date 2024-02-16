package lesson_24.printers;

public interface Printable {
    // Константа. По умолчанию имеет: public static final. Поменять нельзя!!!
    public static final int POWER = 220;

    // Интерфейс абстрактны косвенно (по умолчанию абстрактный).
    // Каждый метод в интерфейсе косвенно абстрактный и публичный.
    // Нам не нужно писать public abstract, эти модификаторы уже есть по умолчанию у каждого метода интерфейса.
    void print();

    // Перегрузка метода
    void print(int number);


    // c JDK 8 - доступны методы по умолчанию
    default void sayHello(String string) {
        System.out.println("Hello, " + string + "; " + POWER);
        privateMetod();
    }

    // c JDK 8 - доступны статические методы
    static void staticMethod() {
        System.out.println("Iam static");
        // доступен только статический контент, что бы вызвать статический интерфейс
        staticPrivateMethod();
    }

    private static void staticPrivateMethod(){
        System.out.println("Iam staticPrivateMethod");
    }

    // c JDK 9 - мы можем определять privet методы
    private void privateMetod(){
        System.out.println("Iam private");
    }

}
