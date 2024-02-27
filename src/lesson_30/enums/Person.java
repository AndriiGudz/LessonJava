package lesson_30.enums;

public class Person {
    private String name;
    private int age;

    private Day dayWeekOfBirth;

    public Person(String name, int age, Day dayWeekOfBirth) {
        this.name = name;
        this.age = age;
        this.dayWeekOfBirth = dayWeekOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Day getDayWeekOfBirth() {
        return dayWeekOfBirth;
    }

    public void setDayWeekOfBirth(Day dayWeekOfBirth) {
        this.dayWeekOfBirth = dayWeekOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dayWeekOfBirth=" + dayWeekOfBirth +
                '}';
    }
}
