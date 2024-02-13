package lesson_21;

public class StringBuilderExample {
    public static void main(String[] args) {

//        StringBuilder - класс для работы с последовательностью символов
//        В отличии от String объекты SB можно изменять после их создания.
//        Это делает его особенно полезным и удобным в ситуациях, когда нам
//        требуется много операций по изменению строки (конкатенация, вставка, вырезание в/из середины строки)
//        Существенно уменьшает нагрузку на память и повышает производительность.

        StringBuilder sb = new StringBuilder();

//        append - добавляет строковое представление любого типа данных (строка, число, символ) к текущему объекту

        sb.append("Hello").append(", ").append("World!");

//        toString - возвращает строку-представление
        String result = sb.toString();
        System.out.println(result);

//        Hello, World! - написать метод, вставляющий внутрь строки, начиная с индекса Х, другую строку.
//        insert - вставляет строку в указанную позицию текущего SB
        sb.insert(3, "JAVA");
        System.out.println(sb.toString());

//        delete, deleteCharat - удаление диапозона по индексам, удаление 1 символа по индексу
        sb.delete(3, 6); // первый включительно, второй не включительно. Удалит 3, 4, 5 символ
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());

//        revers() - переворачивает содержимое объекта, делая строку зеркальной
        sb.reverse();
        System.out.println(sb.toString());

//        length - возвращает текущее количество символов в объекте
        System.out.println(sb.length());

//        setLength - устанавливает новую длину последовательности символов
        sb.reverse();
        System.out.println(sb.toString());
        sb.setLength(11);
        System.out.println(sb.toString());

//        Брат близнец, но работает медленнее, т.к. потокобезопасен.
        StringBuffer stringBuffer = new StringBuffer();

    }
}
