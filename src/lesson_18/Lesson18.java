package lesson_18;

public class Lesson18 {
    public static void main(String[] args) {
        int sum = MathUtils.sumOfInts(1, 4, 5, 6);
        System.out.println("sum: " + sum);

        /*
        1. Не статические методы могут обращаться к нестатическим полям и методам.
        2. Не статические методы могут обращаться к статическим полям и методам.
        3. Статические методы могут обращаться к статическим полям и методам.
        3. Статические методы НЕ могут обращаться к НЕ-статическим полям и методам.
         */
    }
}
