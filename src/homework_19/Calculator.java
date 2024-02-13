package homework_19;
/*
Класс "Калькулятор" Создайте класс Calculator, который будет предоставлять базовые арифметические операции:
сложение, вычитание, умножение и деление.
Класс должен содержать: Статические методы для каждой операции,
принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {

    public static int sum (int a, int b) {
        int result = a + b;
        return result;
    }

    public static int minus (int a, int b) {
        int result = a - b;
        return result;
    }

    public static int mult (int a, int b) {
        int result = a * b;
        return result;
    }

    public static int del (int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения: " + Calculator.sum(5, 3));
        System.out.println("Результат вычитания: " + Calculator.minus(10, 3));
        System.out.println("Результат умножения: " + Calculator.mult(5, 3));
        System.out.println("Результат деления: " + Calculator.del(15, 3));


    }
}
