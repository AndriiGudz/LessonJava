package homework_22.task_1;
/*
Task 1:
Напишите иерархию классов человек -> спортсмен-любитель - > спортсмен-профи
У человека есть метод бежать. Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Human {

    private static int runSpeed = 10;
    private static int timeRelax = 15;

    public Human() {
        this.runSpeed = runSpeed;
        this.timeRelax = timeRelax;
    }

    public static int getRunSpeed() {
        return runSpeed;
    }

    public static void setRunSpeed(int runSpeed) {
        Human.runSpeed = runSpeed;
    }

    public static int getTimeRelax() {
        return timeRelax;
    }

    public static void setTimeRelax(int timeRelax) {
        Human.timeRelax = timeRelax;
    }

    public void run () {
        System.out.println("Человек бежит со скоростью " + runSpeed + " км/ч");
        relax();
    }

    private void relax() {
        System.out.println("После пробежки мне необходимо отдохнуть " + timeRelax + " минут");
    }

}
