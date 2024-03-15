package homework_42;

import lesson_42.groupBy.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Task 1
Дан список сотрудников (Employee) с полями name, department, salary.
Используя Stream API, сгруппируйте сотрудников по отделам

Task 3
Дан список Employee.
Вычислите среднюю зарплату сотрудников в каждом отделе и найдите отдел с максимальной средней зарплатой.
 */
public class Task_1_3 {
    public static void main(String[] args) {
        groupEmployee();
        // task3();
    }
    private static void groupEmployee() {
        List<lesson_42.groupBy.Employee> employees = new ArrayList<>(List.of(
                new lesson_42.groupBy.Employee("Petr", 2500, 25, "developer", "IT"),
                new lesson_42.groupBy.Employee("Silvia", 1500, 22, "trainee", "IT"),
                new lesson_42.groupBy.Employee("Stefan", 2500, 30, "PM", "IT"),
                new lesson_42.groupBy.Employee("Olivia", 2700, 25, "manager", "Management"),
                new lesson_42.groupBy.Employee("Sebastian", 3500, 25, "chef", "Management"),
                new lesson_42.groupBy.Employee("Hanna", 1300, 25, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        // Группировка сотрудников по отделам
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        // Вывод результатов
        groupedByDepartment.forEach((department, employeeList) -> {
            System.out.println(department + ":");
            employeeList.forEach(employee -> System.out.println("    " + employee));
        });

    }

    private static void task3(List<Employee> employees) {

        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(averageSalaries);

        Map.Entry<String, Double> maxAverage1 = averageSalaries.entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
                .orElse(null);

        Map.Entry<String, Double> maxAverage2 = averageSalaries.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println("Отдел с максимальной зарплатой:");
        if (maxAverage1 != null) {
            System.out.println(maxAverage1.getKey() + " | ср. зп: " + maxAverage1.getValue());
        }
    }
}
