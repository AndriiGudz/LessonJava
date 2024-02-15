package homework_22.task_1;

import homework_22.task_1.AthleteAmateur;
import homework_22.task_1.AthleteProfessional;
import homework_22.task_1.Human;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        System.out.println("============================");

        Human amteur = new AthleteAmateur();
        amteur.run();
        System.out.println("============================");

        Human professional = new AthleteProfessional();
        professional.run();
    }
}
