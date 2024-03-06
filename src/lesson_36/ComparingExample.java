package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {
        int[] ints = {9, 5, 1, 4, 2, 7, 6, 0};
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[7];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);
        cars[5] = new Car("null", 2021, 0);
        cars[6] = new Car("Alfa", 2019, 150);

        // Статический метод comparing - возвращает новый компаратор.
        // :: -> Ссылка на методы. Позволяет ссылаться на метод без его выполнения
        // Comparator.comparing(Car::getMaxSpeed);
        Comparator<Car> carComparator = Comparator.comparing(Car::getMaxSpeed);
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        // Специализированная версия comparing для сравнения примитивов
        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));

        System.out.println(Arrays.toString(cars));

        // Обратный метод сортировки -> reversed
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.naturalOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(String::compareTo)));
        System.out.println(Arrays.toString(cars));

        // Сравнить по модели, если одинаковая - сравнить по году.
        Comparator<Car> comparator = Comparator.comparing(Car::getModel).thenComparing(Car::getYear);

        // Сначала сортируем по модели, если модели совпадают - ты сравниваем по году
        Arrays.sort(cars, comparator);
        System.out.println(Arrays.toString(cars));

        // Реализовать сортировку машин по убыванию максимальной скорости
        // Если скорости равны - отсортировать по возрастанию года
        System.out.println("\n==================================\n");
        Comparator<Car> comparator1 = Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()).thenComparing(Car::getYear);
        Arrays.sort(cars, comparator1);
        System.out.println(Arrays.toString(cars));

        // Реализовать сортировку по году выпуску, если год совпадает по убыванию максимальной скорости
        System.out.println("\n==================================\n");
        Arrays.sort(cars, Comparator
                .comparing(Car::getYear)
                .thenComparing(Car::getMaxSpeed, Comparator.reverseOrder())
        );
        System.out.println(Arrays.toString(cars));


    }
}
