package lesson_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeApi {
    // Библиотека для работы с датой и временем
    public static void main(String[] args) {
        /*
        LocalDate
        LocalTime
        LocalDateTime
        ZonedDateTime
        Duration
        Period
         */

        // LocalDate - представляет дату (год, месяц, число)

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("now: " + date);
        LocalDate tomorrow = date.plusDays(1); // Прибавляет к текущей дате +х дней
        System.out.println(tomorrow);

        System.out.println("date.plusWeeks(2): " + date.plusWeeks(2)); // Прибавляет к текущей дате +х недель
        System.out.println("date.plusMonths(12): " + date.plusMonths(12)); // Прибавляет к текущей дате +х месяцев

        System.out.println("yesterday: " + date.minusDays(1)); // Отнимает от текущей дате +х дней

        // Получить объект соответствующий дате
        LocalDate date1 = LocalDate.of(2002, 2, 11);
        date1 = LocalDate.of(2002, Month.FEBRUARY, 11);
        System.out.println("date1: " + date1);

        System.out.println("Год: " + date1.getYear() + ", месяц: " + date1.getMonth() + ", число: " + date1.getDayOfMonth());
        System.out.println("День недели: " + date1.getDayOfWeek() + ", день года: " + date1.getDayOfYear() + ", номер месяца: " + date1.getMonthValue());
        System.out.println("date1.lengthOfMonth(): " + date1.lengthOfMonth());

        System.out.println("======================================================");
        // LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // текущее время
        System.out.println("now: " + time);

        time = LocalTime.of(21, 33, 59);
        time = LocalTime.of(21, 33, 59, 15458);
        System.out.println(time);

        System.out.println("time.plusHours(1): " + time.plusHours(1)); // Прибавляет к текущему времени х часов
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65)); // Прибавляет к текущему времени х минут
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30)); // Отнимает от текущего времени х секунд

        System.out.println("час: " + time.getHour() + ", минуты: " + time.getMinute() + ", секунды: " + time.getSecond());

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime.getHour() + " | " + parseTime.getMinute());
        // ожидает формат строки ISO-8601 ("2001-01-15T08:15:45+01:00")
        String isoString = "18:31:42";

        LocalTime parse = LocalTime.parse(isoString);
        System.out.println(parse);

        System.out.println("\n=========================LocalDateTime=============================\n");
        // LocalDateTime - представляет дату и время без учета часового пояса

        LocalDateTime localDateTime = LocalDateTime.now(); // текущая дата и время
        System.out.println("localDateTime: " + localDateTime);

        LocalDate localDate = LocalDate.of(2023, Month.MARCH, 8);
        LocalTime localTime = LocalTime.of(15, 31, 25);

        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek());
        System.out.println("dateTime.getDayOfWeek().getValue(): " + dateTime.getDayOfWeek().getValue());

        dateTime = LocalDateTime.now();
        System.out.println(dateTime.plusDays(15));
        System.out.println(dateTime.minusMinutes(30));

        System.out.println("\n=========================ZoneDateTime=============================\n");
        // ZoneDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zonedDateTime.getZone(): " + zonedDateTime.getZone());

        zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("Asia/Aden"));
        System.out.println(zonedDateTime);

        System.out.println("\n ================== isAfter, isBefore, until ================== \n");
        // isAfter, isBefore, until, equals - есть у всех объектов представляющий дату и/или время

        // isAfter - проверяет, что текущий объект после (позже) указанного объекта
        LocalDate date2 = LocalDate.of(2020, 10, 15);
        LocalDate date3 = LocalDate.of(2020, 6, 25);

        System.out.println("date2.isAfter(date3): " + date2.isAfter(date3));

        // isBefore - проверяет, что текущий объект до (раньше) указанного объекта
        System.out.println("date2.isBefore(date3): " + date2.isBefore(date3));

        // equals - проверяет дату/время на равенство
        System.out.println("date2.equals(date3): " + date2.equals(date2));

        // until - метод измеряет разницу между текущим и указанным объектом даты/времени -> long

        long daysBetween = date3.until(date2, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);

        long yearsBetween = date3.until(date2, ChronoUnit.YEARS);
        System.out.println("yearsBetween: " + yearsBetween);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 11, 15, 15, 30);

        long hours = now.until(dateTime1, ChronoUnit.HOURS);
        System.out.println("hours: " + hours);

        long hoursBetween = ChronoUnit.HOURS.between(now, dateTime1);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n ================== Duration ================== \n");
        // Duration - представляет продолжительность в секундах или наносекундах

        System.out.println(System.currentTimeMillis());
        Instant start = Instant.now();

        for (int i = 0; i < 100000; i++) {

        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toSeconds());

        System.out.println("\n ================== Period ================== \n");
        // представляет период в годах, месяцах и днях
        LocalDate now2 = LocalDate.now();
        LocalDate dateTime2 = LocalDate.of(2022, 11, 15);

        Period period = Period.between(now2, dateTime2);
        System.out.println(period);

        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());
        System.out.println(period.get(ChronoUnit.DAYS));

        System.out.println("\n ================== DateTimeFormatter ================== \n");
        // DateTimeFormatter - форматирование даты и времени

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy|dd|MM H:mm:ss");

        String formattedDate = localDateTime1.format(formatter);
        String formattedDate1 = localDateTime1.format(formatter1);
        String formattedDate2 = localDateTime1.format(formatter2);
        System.out.println(formattedDate);
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);

        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12, флаг а - для отображения индикатора АМ/РМ
        m - минуты
        s - секунды
         */

        /*
        Количество повторений символа определяет формат вывода (года/месяца)
         */

        String dateForParseString = "24|19|03 20:32:16";
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yy|dd|MM H:mm:ss");

        LocalDateTime parseDateTime = LocalDateTime.parse(dateForParseString, formatterDate);
        System.out.println(parseDateTime + " - " + parseDateTime.getYear());

        /*
        "15-12-2022 20-46"
        Запарсить из строки объект LocalDateTime
        распечатать + отдельно распечатать месяц, день, час

        "13-01-2023 00-47"
        какому дню недели соответствует вторая дата
        Сколько дней между этими датами
         */



    }
}