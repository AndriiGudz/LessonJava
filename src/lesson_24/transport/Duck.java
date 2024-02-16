package lesson_24.transport;

public class Duck implements Flyable, Swimmable {
    private String color;

    public Duck(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void fly() {
        System.out.println("Уточка " + color + " летит на юг");
    }

    @Override
    public void swim() {
        System.out.println(color + " утка плывет по озеру");
    }
}
