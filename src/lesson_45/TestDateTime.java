package lesson_45;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestDateTime {
    public static void main(String[] args) {

        // Парсинг строки в объект LocalDateTime
        String dateTimeString1 = "15-12-2022 20-46";
        LocalDateTime dateTime1 = parseDateTime(dateTimeString1);
        System.out.println("Дата и время: " + dateTime1);

        // Распечатка месяца, дня и часа
        System.out.println("Месяц: " + dateTime1.getMonth());
        System.out.println("День: " + dateTime1.getDayOfMonth());
        System.out.println("Час: " + dateTime1.getHour());

        // Парсинг второй строки в объект LocalDateTime
        String dateTimeString2 = "13-01-2023 00-47";
        LocalDateTime dateTime2 = parseDateTime(dateTimeString2);

        // Определение дня недели для второй даты
        DayOfWeek dayOfWeek = dateTime2.getDayOfWeek();
        System.out.println("День недели для второй даты: " + dayOfWeek);

        // Определение количества дней между двумя датами
        long daysBetween = ChronoUnit.DAYS.between(dateTime1, dateTime2);
        System.out.println("Количество дней между датами: " + daysBetween);
        System.out.println("\nКоличество дней между датами: " + dateTime1.until(dateTime2, ChronoUnit.DAYS));
    }

    // Метод для парсинга строки в LocalDateTime
    private static LocalDateTime parseDateTime(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        return LocalDateTime.parse(dateTimeString, formatter);
    }

}