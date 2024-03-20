package homework_45;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/*
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
public class Task_2 {
    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2023, 1, 1),
                LocalDate.now(),
                LocalDate.of(2024, 10, 15)
        );

        System.out.println(dates);

        long daysBetween = getDaysBetweenEarliestAndLatest(dates);
        System.out.println("Количество дней между самой ранней и поздней датами: " + daysBetween);


    }

    public static long getDaysBetweenEarliestAndLatest(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не может быть пустым");
        }

        LocalDate earliestDate = dates.get(0);
        LocalDate latestDate = dates.get(0);

        for (LocalDate date : dates) {
            if (date.isBefore(earliestDate)) {
                earliestDate = date;
            }
            if (date.isAfter(latestDate)) {
                latestDate = date;
            }
        }

        // return earliestDate.until(latestDate).getDays();
        return earliestDate.until(latestDate, ChronoUnit.DAYS);
    }

}
