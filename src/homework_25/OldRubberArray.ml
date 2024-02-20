
//    // Динамическое изменение размера массива
//    private void expandArray() {
//        System.out.println("Расширяем массив! ================= " + cursor);
//        // 1. создать новый массив большего размера
//        // 2. Переписать значения из старого массива в новый
//        // 3. Перебросить ссылку
//
//        int[] newArray = new int[array.length * 2]; // создаю новый массив, в 2 раза больше предыдущего
//
//        for (int i = 0; i < cursor; i++) {
//            newArray[i] = array[i]; // Переписать значения из старого массива в новый
//        }
//
//        array = newArray; // 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
//        System.out.println("Расширение массива завершено ==================\n");
//    }
//
//    //Возвращение значения по индексу
//    public int get(int index) {
//        if (index >= 0 && index < cursor) {
//            return array[index];
//        } else {
//            return Integer.MIN_VALUE; // хорошего решения на этой стадии нет
//            //TODO Поправить потом
//        }
//    }
//

//
//    public void showCursor() {
//        System.out.println("array[cursor-1]= " + array[cursor - 1]);
//        System.out.println("array[cursor]= " + array[cursor]);
//    }
//
//    //    Удаление элемента по индексу
//    public int remove(int index) {
//        // 1. Проверка
//        if (index < 0 && index >= cursor) {
//            // такого индекса в массиве нет
//            return Integer.MIN_VALUE;
//        }
//
//        int value = array[index];
//
//        for (int i = index; i < cursor - 1; i++) {
//            array[i] = array[i + 1];
//        }
//
//        cursor--;
//
//        return value;
//    }
//
//    public boolean removeByValue(int value) {
//        // Понять есть ли такой элемент в массиве
//        // Если нет - вернуть false и закончить работу методы
//        // если есть - получить его индекс
//        // переиспользовать метод, удаляющий по индексу.
//
//        int index = indexOf(value);
//        // Ctrl + Alt + <- вернуть курсор на предыдущую позицию
//
//        if (index == -1) return false;
//
//        remove(index);
//        return true;
//
//    }