package homework_25;

public class RubberArray<T> implements MyList<T> {

    private T[] array;
    private int cursor; // присвоено значение по умолчанию 0


    public RubberArray() {
        array = (T[]) new Object[10]; // Создаем массив объектов типа Т
    }

    // ++ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями
    public RubberArray(T[] values) {
        array = (T[]) new Object[values.length * 2];

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }
    // Метод для расширения массива
    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    // TODO Добавлять в массив элемент
    @Override
    public void add(T value) {
        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }
        array[cursor] = value;
        cursor++;
    }

    //Добавлять в массив сразу несколько элементов
    @Override
    public void addAll(T... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }


    //Вывод в консоль значений массива
    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }



}