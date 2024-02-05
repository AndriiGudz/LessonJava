package lesson_07;

import java.util.Random;

public class SwichExample {
    public static void main(String[] args) {


        // В switch могут быть следующие данные:
        // byte, short, char, int
        // Byte, Short, Charter, Integer
        // String
        // Перечисления Enum


        int x = 5;

        if (x == 5) {
            System.out.println("if x = 5");
        } else if (x == 7) {
            System.out.println("if x = 7");
        } else {
            System.out.println("else x имеет другое значение");
        }

        System.out.println("========================================");

        switch (x) {
            case 5:
                System.out.println("switch x = 5");
                break;
            case 7:
                System.out.println("switch x = 7");
                break;
            default:
                System.out.println("switch x имеет другое значение");
        }

        System.out.println("Продолжение программы.");
        System.out.println("========================================");

        // Задача. У реенка есть карманные деньги. Сейчас у него есть 100 денег.
        // Ребенок за хорошие оценки получает деньги, а за плохие - отдает.
        // 5 -- +20 денег
        // 4 -- +10 денег
        // 3 -- ничего
        // 2 -- -20 денег
        // 1 -- -все деньги
        // Сколько денег у ребенка после получения оценки.

        Random random = new Random();
        int note = random.nextInt(5) + 1;

        switch (note) {
            case 5:
                System.out.println("Оценка 5, +20 денег. Итого 120");
                break;
            case 4:
                System.out.println("Оценка 4, +10 денег. Итого 110");
                break;
            case 3:
                System.out.println("Оценка 3. Итого 100");
                break;
            case 2:
                System.out.println("Оценка 2, -20 денег. Итого 80");
                break;
            case 1:
                System.out.println("Оценка 1. У вас забрали деньги");
            default:
        }

    }
}
