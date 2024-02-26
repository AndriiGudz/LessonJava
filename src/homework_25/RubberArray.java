package homework_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RubberArray<T> implements MyList<T> {

    private T[] array;
    private int cursor; // присвоено значение по умолчанию 0

    @SuppressWarnings("unchecked")
    public RubberArray() {
        array = (T[]) new Object[10]; // Создаем массив объектов типа Т
    }

    // ++ Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями
    @SuppressWarnings("unchecked")
    public RubberArray(T[] values) {
        array = (T[]) new Object[values.length * 2];

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    /**
     * The constructor `RubberArray(T[] values)` creates a new `RubberArray` object and populates it with values from the `values` array.
     *
     * **Parameters:**
     * - `values`: an array of values to be added to the new `RubberArray` object.
     *
     * **Actions:**
     * 1. Creates a new array of objects of type `T` with a size of `values.length * 2`.
     * 2. For each element `value` in the `values` array, performs an addition operation to the `RubberArray` object using the `add(value)` method.
     *
     * **Note:**
     * - If during the addition of elements to the `RubberArray`, the number of elements reaches 90% of the maximum array size, the array will automatically be doubled in size, preserving all existing elements and adding new ones.
     */

    // Метод для расширения массива
    @SuppressWarnings("unchecked")
    private void expandArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    // Добавлять в массив элемент
    @Override
    public void add(T value) {
        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш массив
        }
        array[cursor] = value;
        cursor++;
    }

    // Добавлять в массив сразу несколько элементов
    @Override
    public void addAll(T... values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // Вывод в консоль значений массива
    public String toString() {
        if (cursor == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
//        String result = "[";
        for (int i = 0; i < cursor; i++) {
//            result += array[i] + ((i < cursor - 1) ? ", " : "]");
            sb.append(array[i]).append((i < cursor - 1) ? ", " : "]");
        }
//        return result;
        return sb.toString();
    }

    // Возвращает количество элементов в массиве
    @Override
    public int size() {
        return cursor;
    }

    // Поиск элемента по значению, int - индекс элемента
    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                System.out.print("Первое вхождение элемента \"" + value + "\" в массиве под индексом: ");
                return i;
            }
        }
        System.out.println("Элемент \"" + value + "\" отсутствует в массиве");
        return -1;
    }

    // Поиск элемента по значению, int - индекс последнего вхождения
    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                System.out.print("Последнее вхождение элемента \"" + value + "\" в массиве под индексом: ");
                return i;
            }
        }
        System.out.println("Элемент \"" + value + "\" отсутствует в массиве");
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0; // Если элемент есть - indexOf - вернет положительное число
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        // TODO  - метод не работает
        // 1. создать массив нужной длины и типа
        // 2. переписать значения в новый массив
        // 3. вернуть новый массив из метода

        T[] result = (T[]) new Object[cursor]; // создаем массив длинной cursor
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        System.out.println("========== instanceof: " + (result[0] instanceof Integer));
        // return Arrays.copyOf(array, cursor); - альтернативный вариант
        // System.arraycopy(array, 0, result, 0, cursor); - альтернативный вариант
        return result;
    }

    public T[] toArray(Class<T> clazz) {


        // Рефлексия
        // 1. Создаем массив длинной cursor(кол-во элементов во внутреннем массиве)
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(clazz, cursor);
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        System.out.println("========== instanceof: " + (result[0] instanceof Integer));
        return result; // Integer[]
    }

    // Удаляет один элемент по значению
    @Override
    public boolean remove(T value) {
        System.out.println("Удаляет один элемент по значению");
        // Понять есть ли такой элемент в массиве
        // Если нет - вернуть false и закончить работу методы
        // если есть - получить его индекс
        // переиспользовать метод, удаляющий по индексу.
        int index = indexOf(value);
        // Ctrl + Alt + <- вернуть курсор на предыдущую позицию

        if (index == -1) return false;

        remove(index);
        return true;
    }

    // Удаление элемента по индексу
    @Override
    public T remove(int index) {
        System.out.println("Удаление элемента по индексу");
        // 1. Проверка
        if (index < 0 && index >= cursor) {
            // такого индекса в массиве нет
            return null;
        }

        T value = array[index];

        // перезаписываем все значения, начиная с удаляемого индекса
        // значениями по порядку
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }

        cursor--;
        return value;
    }

    // Является ли коллекция пустой
    @Override
    public boolean isEmpty() {
        return cursor == 0;
    }

    // Получить значение по индексу
    @Override
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            System.out.print("Значение под индексом '" + index + "' равно: ");
            return array[index];
        } else {
            System.out.print("Значение под индексом '" + index + "' не существует: ");
            return null;
        }
    }

    // Перезаписывает значение по указанному индексу
    @Override
    public void set(int index, T value) {
        // 1. проверка индекса
        if (index < 0 || index > cursor -1) return;
        array[index] = value;
    }
}