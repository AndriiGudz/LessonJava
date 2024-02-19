package lesson_25;

public class GenericsBox <T> { // E, K, V - символ заполнитель
    private T value;
    public GenericsBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericsBox {" +
                "value=" + value +
                '}';
    }
}
