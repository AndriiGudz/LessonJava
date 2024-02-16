package homework_23;

/*
Task 0
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.

Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
abstract public class Shape {
    abstract public double calculateArea();
    abstract public double calculatePerimeter();

}
