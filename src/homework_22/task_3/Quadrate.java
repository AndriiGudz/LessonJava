package homework_22.task_3;

public class Quadrate extends Figure {
    private double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Квадрат";
    }
}
