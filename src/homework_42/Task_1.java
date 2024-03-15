package homework_42;

import lesson_42.groupBy.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Дан список сотрудников (Employee) с полями name, department, salary.
Используя Stream API, сгруппируйте сотрудников по отделам
 */
public class Task_1 {
    public static void main(String[] args) {
        groupEmployee();
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
}
