package homework_19;
/*
Task 1
Класс "Счётчик" Разработайте класс Counter, который позволяет создавать объекты-счётчики
с возможностью увеличения и уменьшения значения счётчика. В классе должны быть:
Поле value для хранения текущего значения счётчика.
Методы increment() и decrement(), увеличивающие и уменьшающие значение счётчика соответственно.
Метод getValue() для получения текущего значения счётчика.
 */

public class Counter {
    private static int value;
    public Counter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }



    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Текущее значение счетчика: " + counter.getValue());

        counter.increment();
        counter.increment();
        System.out.println("Текущее значение счетчика: " + counter.getValue());

        counter.decrement();
        System.out.println("Текущее значение счетчика: " + counter.getValue());


    }

}
