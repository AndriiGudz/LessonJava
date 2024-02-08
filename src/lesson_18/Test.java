package lesson_18;

public class Test {

    static int counter;
    int x;

    public static void main(String[] args) {
//        x = 10; // Ошибка компиляции.
//        System.out.println(x);
        test();
        counter = 1000;
    }
// Статика имеет доступ только к статике !!!
    public static void test() {
        System.out.println("Test");
    }

    public static void test2() {
        System.out.println("Test2");
    }

}
