package homework_40.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Дан список Person с полями name, age, city.
Используйте Stream API для фильтрации людей, которые старше определенного возраста
и проживают в определенном городе, а затем соберите их в список.
 */
public class Task_5 {
    public static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        // Создаем список людей
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "London"));
        people.add(new Person("Daria", 40, "New York"));
        people.add(new Person("Maikl", 38, "New York"));

        // Определенный возраст и город для фильтрации
        int targetAge = 35;
        String targetCity = "New York";

        // Фильтрация людей по возрасту и городу, сборка в список
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > targetAge)
                .filter(person -> person.getCity().equals(targetCity))
                .collect(Collectors.toList());

        // Вывод результатов
        System.out.println("Люди старше " + targetAge + " живут в городе " + targetCity + ":");
        filteredPeople.forEach(person -> System.out.println(person.getName()));
    }
}
