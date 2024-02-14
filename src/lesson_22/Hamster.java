package lesson_22;

public class Hamster extends Animal {
    @Override // Аннотация.
    public void voice() {
        System.out.println("Hamster say Hrum-Hrum!");
    }
    // Перегрузка - статический полиморфизм
    public void voice(String string) {
        System.out.println("Hamster say: " + string);
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}