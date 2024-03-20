package homework_45;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/*
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class Task_1 {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Текущий год, месяц и день
        int year = currentDate.getYear();
        Month month = currentDate.getMonth();
        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("Текущий год: " + year + " | Текущий месяц: " + month + " | Текущий день: " + dayOfMonth);

        // Создание даты (день рождения)
        LocalDate birthday = LocalDate.of(1980, 11, 18);
        System.out.println("День рождения: " + birthday);

        // Создание двух дат и проверка на равенство
        LocalDate date1 = LocalDate.of(2023, Month.JANUARY, 1);
        LocalDate date2 = LocalDate.of(2024, Month.MARCH, 20);
        System.out.println("Даты равны: " + date1.equals(date2));

        // Текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        // Текущее время + 3 часа
        LocalTime currentTimePlusThreeHours = LocalTime.now().plusHours(3);
        System.out.println("Текущее время + 3 часа: " + currentTimePlusThreeHours);

        // Дата на неделю позже сегодняшней
        LocalDate nextWeek = LocalDate.now().plusWeeks(1);
        System.out.println("Дата на неделю позже сегодняшней: " + nextWeek);

        // Дата, которая была на год раньше сегодняшней
        LocalDate lastYear = LocalDate.now().minusYears(1);
        System.out.println("Дата, которая была на год раньше сегодняшней: " + lastYear);

        // Дата на год позже сегодняшней
        LocalDate nextYear = LocalDate.now().plusYears(1);
        System.out.println("Дата на год позже сегодняшней: " + nextYear);

        // Сравнение с "завтра" и "вчера"
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Завтра после сегодняшней: " + tomorrow.isAfter(LocalDate.now()));
        System.out.println("Вчера до сегодняшней: " + yesterday.isBefore(LocalDate.now()));
    }


}
