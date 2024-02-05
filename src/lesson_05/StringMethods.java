package lesson_05;

public class StringMethods {

    public static void main(String[] args) {

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "String 4";

        // Различные варианты конкатенации
        // 1.
        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);

        concatStr = str1 + " " + str2 + str3 + " " + "String";
        System.out.println(concatStr);

        // 2.
        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase(); // в одну строку
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3); // разбито на две операции
        concatStr2 = concatStr2.toUpperCase(); //в двух рядах
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        System.out.println("Результат concatStr3: " + concatStr3);

        // 3. метод join - статический
        String concatStrJoin = String.join(" ! ", str1, str3, str4);
        System.out.println("Результат concatStrJoin: " + concatStrJoin);
        concatStrJoin = String.join("-", str1, str3, str4);
        System.out.println("Результат concatStrJoin: " + concatStrJoin);


        int int1 = 1;
        int int2 = 2;
        System.out.println(int1 + int2); //математическая операция
        System.out.println("" + (int1 + int2)); //математическая операция
        System.out.println("" + int1 + int2); //конкатенация значений

        int age = 18;

        System.out.println("My age " + age); //все приводятся к результату виде строки и потом идет на печать.

        System.out.println("=========================\n");

        String digitals = "0123456789";
        int len = digitals.length();
        System.out.println("Длина строки: " + digitals.length());
        System.out.println("Длина строки: " + len);

        // Взятие символа по его индексу (порядковому номеру)
        char firstChar = digitals.charAt(0); //в скобках номер индекса, который мне нужно взять
        System.out.println("Порядковый номер: " + firstChar);

        // последний индекс в нашей строке всегда имеет значение (length -1)
        char lastChar = digitals.charAt(digitals.length() - 1);
        System.out.println("Последний индекс (символ): " + lastChar);

//        System.out.println(digitals.charAt(50)); // ошибка, аварийное завершение программы при обращении к несуществующему индексу.
//        System.out.println("End of program");

        // Выделение подстраки из строки.

        String substring = digitals.substring(5); // выделяется подстрока с 5-го индекса до конца строки
        System.out.println("substring: " + substring);
        System.out.println(digitals); //digitals остается не измененной

        substring = digitals.substring(5, 8); // 5-8 --- до 8-го индекса. 8-й индекс не включается (не берется в подстроку)
        System.out.println("substring 5-8: " + substring);
        substring = digitals.substring(5, digitals.length()-2); // можно использовать формулу
        System.out.println("substring 5-8: " + substring);

        // ищет индекс начала вхождения подстроки в строке
        digitals = "0123456789-19-0156";
        System.out.println("digitals: " + digitals);

        int index = digitals.indexOf('4'); // ищет слева
        System.out.println("index: " + index);
        index = digitals.indexOf("44"); // если выводит ответ -1 - это значит что символ не найден.
        System.out.println("index: " + index);
        index = digitals.lastIndexOf("01"); // ищет справа, выводит номер индекса по счету слева
        System.out.println("index: " + index);

        System.out.println("=============================");

        // Замена. Заменяем подстроку на другую
        String target = "abcabeabd";
        String output = target.replace("ab", "AB"); //если последовательность или символ не найден, замены не произойдет.
        System.out.println("output: " + output);

        output = target.replaceFirst("ab", "AB"); //заменяет только первое значение
        System.out.println("output: " + output);

        output = target.replaceAll("ab", "AB");
        System.out.println("output: " + output);

//        target.replace() - использует символ или их последовательность
//        target.replaceAll() - использует регулярные вырожения (шаблоны)
//        target.replaceFirst() - использует регулярные вырожения (шаблоны)





    }
}
