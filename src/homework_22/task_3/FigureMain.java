package homework_22.task_3;

public class FigureMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(4);
        figures[1] = new Quadrate(5);
        figures[2] = new Triangle(3, 3, 4);

        for (Figure figure : figures) {
            double area = figure.calculateArea();
            System.out.println("Площадь фигуры " + figure + " равна: " + area);
        }


    }
}
