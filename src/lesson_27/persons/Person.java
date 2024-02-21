package lesson_27.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    // john@test.net
    // 1. done - должен присутствовать символ '@' и должен быть только один
    // 2. done - точка после собаки
    // 3. done - точка не может быть сразу после собаки
    // 4. done - после последней точки должно быть не менее двух символов
    // 5. done - могут присутствовать только символы алфавита, цифры, '-', '_', '.', '@'
    // 6. done - место для символа '@' - хотя бы один символ до собаки
    // 7. done - первый символ должен быть - алфавитный
    private boolean isEmailValid(String email) {
        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty()) return false;
        // tttt@tr@@@@tr@tr.net
        // 1. @
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;

        // 2. должна быть точка после собаки
        // перегрузка метода начинает после с индекса (в данном случае индекса знака @)
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return false; // инверсия '!' - обязательное отрицание

        // перебираем все символы для проверки
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '@')) return false;
            // true --> если символ удовлетворяет хотя бы одному критерию
        }
        // все проверки пройдены, нигде метод не вернул false
        return true;
    }

    /*
    Требования к валидности паролю
    1. длина пароля больше 8 символов >= 8
    2. мин. 1 маленькая буква
    3. мин. 1 большая буква
    4. мин. 1 цифра
    5. мин. 1 спец символ ("!%$@*&()[])
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
