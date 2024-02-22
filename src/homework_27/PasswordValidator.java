package homework_27;
/*
Требования к валидности паролю
1. длина пароля больше 8 символов >= 8
2. мин. 1 маленькая буква
3. мин. 1 большая буква
4. мин. 1 цифра
5. мин. 1 спец символ ("!%$@*&()[])
 */
public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // 1. длина пароля больше 8 символов >= 8
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            // мин. 1 большая буква
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            // мин. 1 маленькая буква
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            // мин. 1 цифра
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            // мин. 1 спец символ ("!%$@*&()[])
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    // Метод для проверки спец символ ("!%$@*&()[])
    private static boolean isSpecialChar(char ch) {
        char[] specialChars = {'!', '%', '$', '@', '*', '&', '(', ')', '[', ']'};
        for (char special : specialChars) {
            if (ch == special) {
                return true;
            }
        }
        return false;
    }

}
