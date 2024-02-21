package lesson_27.generics;

public class MultiGenericBox <T, V> {

    private T field1;

    private V field2;

    public MultiGenericBox(T field, V field2) {
        this.field1 = field;
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "MultiGenericBox{" +
                "field=" + field1 +
                ", field2=" + field2 +
                '}';
    }

    public static void main(String[] args) {
        MultiGenericBox<String, Integer> multiBox = new MultiGenericBox<>("Test", 100);
        System.out.println(multiBox);
    }
}
