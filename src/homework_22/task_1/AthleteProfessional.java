package homework_22.task_1;

public class AthleteProfessional extends Human {
    private final static int runSpeed = 25;
    private final static int timeRelax = 5;
    @Override
    public void run() {
        System.out.println("Профессионал бежит со скоростью " + runSpeed + " км/ч");
        relax();
    }

    private void relax() {
        System.out.println("После пробежки мне необходимо отдохнуть " + timeRelax + " минут");
    }
}
