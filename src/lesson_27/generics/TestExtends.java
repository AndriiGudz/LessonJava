package lesson_27.generics;

public class TestExtends {
    public static void main(String[] args) {
        // Строгая типизация. На стадии компиляции ошибка.
        System.out.println(GenericMethods.sum(Long.valueOf(1500)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.76), 5.43, 6, 8.43));
    }
}
