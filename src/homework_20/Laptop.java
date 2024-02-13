package homework_20;

public class Laptop extends ElectronicDevice {
    private String screenType;
    private double screenDiagonal;
    private double memory;

    public Laptop(String manufacturer, String model, int year, String screenType, double screenDiagonal, double memory) {
        super(manufacturer, model, year);
        this.screenType = screenType;
        this.screenDiagonal = screenDiagonal;
        this.memory = memory;
    }

    public String info() {
        return super.info() + " | Тип экрана: " + screenType + " | Диагональ экрана: " + screenDiagonal + " | Объем памяти: " + memory;
    }
}
