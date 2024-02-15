package homework_22.task_1;

public class AthleteAmateur extends Human {
    private int runSpeed ;
    private int timeRelax;

    public AthleteAmateur(int runSpeed, int timeRelax) {
        this.runSpeed = runSpeed;
        this.timeRelax = timeRelax;
    }

    @Override
    public void run() {
        System.out.println("Спортсмен любитель бежит со скоростью " + runSpeed + " км/ч");
        relax();
    }

    private void relax() {
        System.out.println("После пробежки мне необходимо отдохнуть " + timeRelax + " минут");
    }
}
