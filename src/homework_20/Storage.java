package homework_20;

public class Storage {
    private String value;
    private Laptop laptop;

    public Storage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
