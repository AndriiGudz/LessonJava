package homework_20;

public class Printer extends ElectronicDevice {
    private String printType;
    private String printInterface;
    private String maxFormat;

    public Printer(String manufacturer, String model, int year, String printType, String printInterface, String maxFormat) {
        super(manufacturer, model, year);
        this.printType = printType;
        this.printInterface = printInterface;
        this.maxFormat = maxFormat;
    }

    public String info() {
        return super.info() + " | Тип принтера: " + printType + " | Интерфейс: " + printInterface + " | Максимальный формат: " + maxFormat;
    }
}
