package homework_14;

public class Task0 {
    public static void main(String[] args) {
//        Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
//        toUpperCase() использовать низзя.

        String myName = "andRRey gudz 12 !@:";
        stringUpperCase(myName);

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

}
