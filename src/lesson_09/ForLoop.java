package lesson_09;

public class ForLoop {
    public static void main(String[] args) {

//        for ( блок инициализации; блок проверок ; изменения счетчиков)
//        тело цикла

        // Распечатать числа от 0 до 10

        int k = 0;

        while (k < 10) {
            //Тело цикла
            //Что-то делать
            k++;
        }

        System.out.println("k -> " + k);

        for (int i = 0; i < 10; i++) {
            //Тело цикла
        }

        // 1. Выполняется блок инициализации. Один раз в самом начале.
        // 2. Делается проверка / проверка в блоке условий
        // 3. Если проверка дала true - выполняется тело цикла (если false - выходим из цикла - тело Не выполняется)
        // 4. По окончанию выполнения цикла, переходим в блок изменений
        // 5. Проверка условий. Если true - выполняется тело. И так по кругу

        // Ни один из блоков не является обязательным.

        int j = 15;

        for (j = 0; j < 20; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("j за циклом: " + j);

        for (String str = "Hello"; str.length() < 10; str += "$") { //в блоках инициализации и проверок могут быть не числа
            System.out.println(str);
        }

        // Мы можем инициализировать несколько переменных. Проверять составные условия.
        // Изменять несколько переменных в блоке изменений.

        int k1 = 0;
        // какие-то строки кода
        k1 = 15;

        for (int a = 0, f = 1; k1 >= 0 && f < 10 ; k--, a = ++a + k1, f++) {
            System.out.println(k1 + " : " + a + " : " + f);
        }


    }
}
