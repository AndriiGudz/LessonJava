package lesson_30.enums;

public class DaysMain {
    public static void main(String[] args) {
        Person person = new Person("John", 31, Day.MONDAY);

        System.out.println(person);

        person.setDayWeekOfBirth(Day.SATURDAY);

        String dayStr = person.getDayWeekOfBirth().toString();
        System.out.println(dayStr);

        // получаю массив Enum
        Day[] days = Day.values();

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        System.out.println("\n=======================\n");

        Day enumMonday = Day.valueOf("MONDAY");
        System.out.println(enumMonday);

        // Сравнение Enum - для сравнения двух значений Enum
        // безопасно и допустимо использовать ==

        System.out.println(enumMonday == Day.THURSDAY);

        switch ((person.getDayWeekOfBirth())) {
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case SATURDAY:
                System.out.println("Суббота");
            default:
                System.out.println("Какой-то другой день недели");
        }

        // порядковый номер int
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(enumMonday.ordinal());

        System.out.println(enumMonday.getRussian());
        enumMonday.setRussian("Пн.");
        System.out.println(enumMonday.getRussian());

        System.out.println("\n=========================\n");
        System.out.println(enumMonday.getDayOfweek());


    }
}
