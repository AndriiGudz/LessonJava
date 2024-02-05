package lesson_05;

public class BooleanExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true; // правда
        bol1 = false;  // ложь

        // Сравнение на равенство.

        bol1 = x == y; // х = у. --> будет выдано утверждение не верно --> false
        System.out.println("х = у --> " + bol1);

        bol1 = x == 10; // х = 10. --> будет выдано утверждение верно --> true
        System.out.println("х = 10 --> " + bol1);

        // Сравнение на НЕравенство.

        boolean bol2 = x != y; // х не равно у
        System.out.println("х != y --> " + bol2);

        bol2 = 10 != x; // х не равно 10
        System.out.println("х != 10 --> " + bol2);


        // Сравнение на больше или меньше чем...

        boolean bol3 = x > y;
        System.out.println("х > y --> " + bol3);

        boolean bol4 = x < y;
        System.out.println("х < y --> " + bol4);


        // Сравнение на больше/меньше или равно чем...

        boolean bol5 = x >= y;
        System.out.println("х >= y --> " + bol5);

        boolean bol6 = x <= y;
        System.out.println("х <= y --> " + bol6);

        boolean bol7 = x >= 10;
        System.out.println("х >= 10 --> " + bol7);

        boolean bol8 = x <= 10;
        System.out.println("х <= 10 --> " + bol8);

        // ! Логическое отрицание - меняет значение на противоположное.

        boolean bol10 = true;
        System.out.println("true: " + bol10);
        bol10 = !true;
        System.out.println("!true: " + bol10);
        System.out.println("!false: " + !false);

        System.out.println("! 4==5 -> " + !(4==5)); // 4 равно 5 -> false -> инвертируем !false -> true

        // &Логическое И (AND) Возвращает true, только если все части верны true
        // Рим столица Италии и Берлин столица Англии -> true и false
        // Рим столица Италии и Лондон столица Англии -> true и true

        boolean bol11 = (2 < 5) & (11 == 10); //true & false -> false
        System.out.println("(2 < 5) & (11 == 10) -> " + bol11);

        bol11 = (2 < 5) & (11 != 10); //true & true -> true
        System.out.println("(2 < 5) & (11 != 10) -> " + bol11);

        // | - логическое ИЛИ (OR) -> Возвращает true, если хотябы одна часть true.
        // Рим столица Италии или Берлин столица Англии -> true или false
        // Рим столица Италии или Лондон столица Англии -> true или true
        // Рим столица Англии или Лондон столица Италии -> false или false

        boolean bol12 = (2 < 5) | (11 == 10); //true | false -> true
        System.out.println("(2 < 5) | (11 == 10) -> " + bol12);

        bol12 = (2 > 5) | (11 == 10); //false | false -> false
        System.out.println("(2 > 5) | (11 == 10) -> " + bol12);




    }
}
