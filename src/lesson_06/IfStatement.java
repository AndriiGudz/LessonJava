package lesson_06;

public class IfStatement {
    public static void main(String[] args) {

        int x = 10;

        // Оператор блок {...}. Определяет область видимости перенных.
        {
            int y = 5;
            x = x + y;
        }

        System.out.println("x: " + x);

//        if (условие) Оператор, выполняющийся, если условие равно true
        System.out.println("=====================================");

        int number = 8;

        if (number > 10) System.out.println("number больше 10");
        System.out.println("=====================================");


        if (number > 10) {
            System.out.println("Всем привет!");
            System.out.println("Сейчас number больше 10");
        } else if (number > 7) {
            System.out.println("Else - IF");
            System.out.println("number > 7");
        } else {
            System.out.println("Я ушел!");
            System.out.println("Сейчас number не больше 10");
        }

        System.out.println("Конец программы");

    }
}
