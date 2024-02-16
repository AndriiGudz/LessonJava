package homework_23;

public class FigureMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(5, 3);
        shapes[2] = new Triangle(3, 3, 4);

        double sumArea = 0;

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            sumArea += area;
            System.out.println("Площадь фигуры " + shape + " равна: " + area);
        }
        System.out.println("\nОбщая площадь фигур равна: " + sumArea);

        System.out.println("\n========== Вычисление периметра ============\n");

        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            double area = shape.calculatePerimeter();
            sumPerimeter += area;
            System.out.println("Периметр фигуры " + shape + " равна: " + area);
        }
        System.out.println("\nОбщий периметр фигур равен: " + sumPerimeter);


    }
}
