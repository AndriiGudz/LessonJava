package homework_05;

public class HomeWork05 {
    public static void main(String[] args) {

        // Task 01

        String myName = "Andrey";
//        System.out.println("Букв в имени: " + myName.length());
        int nameLenght = myName.length();
        System.out.println("Букв в имени: " + nameLenght);

        char firstChar = myName.charAt(0);
        char lastChar = myName.charAt((myName.length() - 1));

        System.out.println("Первый символ: " + firstChar);
        System.out.println("Последний символ: " + lastChar);



    }
}
