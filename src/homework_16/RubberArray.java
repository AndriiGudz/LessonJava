package homework_16;
/*
+ 1. Динамическое изменение размера массива
+ 2. Добавлять в массив элементы
+ 3. Добавлять в массив сразу несколько элементов
+ 4. Вывод в консоль значений массива
===================================================
+ 5. Поиск элемента по значению
+ 6. Возвращение значения по индексу
+ 7. Текущее количество элементов в массиве
- 8. Удаление элемента по индексу
- 9. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
- 10. Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
- 11. Удаление элемента по значению
- 12. Замена значения по индексу (есть индекс и новое значение)
- 13. Замена значения по значению (есть старое и новое значение)
 */

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

    //    =============================================================
//    Домашняя работа
//    5. Поиск элемента по значению
    void foundIndex(int target) {
        boolean foundTarget = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                foundTarget = true;
                System.out.println("Найдено искомое значение: " + target);
                break;
            }
        }
        if (foundTarget == false) {
            System.out.println("Искомое значение: " + target + " не найденно.");
        }
    }

    //    6. Возвращение значения по индексу
    void foundTargetInIndex(int index) {
        int value = array[index];
        System.out.println("Значение по индексу " + index + " равно: " + value);
    }

    //    7. Текущее количество элементов в массиве
    void foundLength() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) count++;
        }
            System.out.println("Текущее количество элементов в массиве: " + count);
    }

//    8. Удаление элемента по индексу
//    9. Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
//    10. Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
//    11. Удаление элемента по значению
//    12. Замена значения по индексу (есть индекс и новое значение)
    void replaceTargetToIndex (int target, int index) {
        array[index] = target;
    }
//    13. Замена значения по значению (есть старое и новое значение)
    void  replaceTargetToTarget (int oldTarget, int newTarget) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldTarget) array[i] = newTarget;
        }
    }


}
