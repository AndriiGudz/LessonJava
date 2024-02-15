package homework_22.task_1;

public class AthleteProfessional extends Human {

    private int runSpeed;
    private int timeRelax;

    public AthleteProfessional(int runSpeed, int timeRelax5) {
        this.runSpeed = runSpeed;
        this.timeRelax = timeRelax5;
    }

    @Override
    public void run() {
        System.out.println("Профессионал бежит со скоростью " + runSpeed + " км/ч");
        relax();
    }

    private void relax() {
        System.out.println("После пробежки мне необходимо отдохнуть " + timeRelax + " минут");
    }
}
