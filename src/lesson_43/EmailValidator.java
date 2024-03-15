package lesson_43;

public class EmailValidator {
    // ключевое слово throw - используется для явного выброса (порождения/инициализации) исключения.

    public static void validate(String email) throws EmailValidateException {
        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty()) throw new EmailValidateException("Empty email");
        // tttt@tr@@@@tr@tr.net
        // 1. @
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. должна быть точка после собаки
        // перегрузка метода начинает после с индекса (в данном случае индекса знака @)
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) throw new EmailValidateException(". after @ error");

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateException("last dot error");

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) throw new EmailValidateException("illegal first symbol"); // инверсия '!' - обязательное отрицание

        // перебираем все символы для проверки
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '@'))
                throw new EmailValidateException("illegal symbol");
            // true --> если символ удовлетворяет хотя бы одному критерию
        }
        // все проверки пройдены, нигде метод не вернул false
    }
}
