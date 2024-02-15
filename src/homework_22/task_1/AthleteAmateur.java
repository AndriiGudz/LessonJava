package homework_22.task_1;

public class AthleteAmateur extends Human {
    private final static int runSpeed = 15;
    private final static int timeRelax = 10;

    @Override
    public void run() {
        System.out.println("Спортсмен любитель бежит со скоростью " + runSpeed + " км/ч");
        relax();
    }

    private void relax() {
        System.out.println("После пробежки мне необходимо отдохнуть " + timeRelax + " минут");
    }
}
