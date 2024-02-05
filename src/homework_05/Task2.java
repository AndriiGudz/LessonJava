package homework_05;

public class Task2 {
    public static void main(String[] args) {
        // Создайте строки:
        // "Java"
        // "is"
        // "a"
        // "powerful"
        // "language"
        // Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
        // Распечатать эту строку и ее длину

        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";
        String str6 = " ";

        String rezult = str1 + str6 + str2 + str6 + str3 + str6 + str4 + str6 + str5;

        System.out.println(rezult);
        System.out.println("Длина строки: " + rezult.length() + " символов.");

        System.out.printf("\n%s %s %s %s %s\n", str1, str2, str3, str4, str5);

    }
}
