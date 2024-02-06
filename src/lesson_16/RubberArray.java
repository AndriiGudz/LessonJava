package lesson_16;

public class RubberArray {

    int[] array;
    int cursor; // присвоено значение по умолчанию 0

    public RubberArray() {
        array = new int[10];
    }

    void add(int number) {
        // Добавлять значения в наш массив

        // проверка. Есть ли место в нашем внутреннем массиве?

        if (cursor > array.length * 0.9) {
            expandArray(); // метод расширяющий наш масси
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints) {
        // ints - я могу с ним обращаться точно так же как с ссылкой на массив
        // могу делать с ним что угодно

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    void expandArray() {
        System.out.println("Для справки. Расширяем массив! ==========================" + cursor);
        // 1. создать новый массив большего размера
        // 2. переписать значения из старого массива в новый
        // 3. перебросить ссылку

        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // переписать значения из старого массива в новый
        }

        array = newArray; // Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив.
        System.out.println("Для справки. Расширение массива завершено! ==========================");

    }

    public String toString() {
        if (cursor == 0) return "[]";
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

}

/*
1. Динамическое изменение размера массива
2. Добавлять в массив элементы
3. Добавлять в массив сразу несколько элементов
4. Вывод в консоль значений массива
 */