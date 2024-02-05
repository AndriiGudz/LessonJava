package homework_07;

public class Task4 {
    public static void main(String[] args) {

        int var1 = 0; //отслеживаем количество напечатанных цифр
        int var2 = 1;

        while (var1 < 7) { //делаем цикл пока не напечатаем 7 цифр
            if (var2 % 5 == 0) {
                System.out.println(var2);
                var1++;
            }
            var2++;
        }

    }
}
