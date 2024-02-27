package homework_30;
/*
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */
public enum Season {
    SPRING(15.0),
    SUMMER(25.0),
    AUTUMN(10.0),
    WINTER(0.0);

    private double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}