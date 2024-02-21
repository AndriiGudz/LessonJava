package lesson_27.generics;

public class GenericMethods {
    // Ограничиваем диапазон принимаемых типов данных
    // Ограничение сверху.
    public static <T extends Number> int sum(T... elements) {
        int sum = 0;
        for (T value : elements) {
            sum += value.intValue();
        }
        return sum;

        // <? extends Number> --> (Wild Card) - любой тип данных, являющиеся наследником Number.
    }
}
