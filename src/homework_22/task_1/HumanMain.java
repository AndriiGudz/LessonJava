package homework_22.task_1;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        System.out.println("============================");

        Human amteur = new AthleteAmateur(15, 10);
        amteur.run();
        System.out.println("============================");

        Human professional = new AthleteProfessional(25, 5);
        professional.run();
    }
}
