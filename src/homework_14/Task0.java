package homework_14;

public class Task0 {
    public static void main(String[] args) {
//        Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
//        toUpperCase() использовать низзя.

        String myName = "andRRey gudz 12 !@:";

        System.out.println("Вариант 1");
        stringUpperCase(myName);

        System.out.println("\nВариант 2");
        System.out.println(stringToUpperCase(myName));

    }// End

    public static void stringUpperCase(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            char simbol = str1.charAt(i);
            if (str1.charAt(i) >= 97 & str1.charAt(i) <= 122){
                simbol -=32;
            }
            System.out.print(simbol);
        }
    }

    public static String stringToUpperCase(String str1) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char simbol = str1.charAt(i);
            if (str1.charAt(i) >= 97 & str1.charAt(i) <= 122) {
                simbol -= 32;
            }
            result += simbol;
        }
//        System.out.println(result);
        return result;
    }

}
