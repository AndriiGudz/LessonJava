package lesson_19;

public class FinalDemo {

    public static final double PI = 3.141519; // Константа
    public static final int[] INTS = new int[10]; // Не является константой, т.к. состояние обьекта (значения элементов)
    private final int x;
    // Изменить значение final нельзя. Присваивается только один раз.

    private final int[] ints;
    // Нельзя переписать ссылку для final переменной ссылочного типа.

    public FinalDemo(int x) {
        this.x = x;
        ints = new int[10];
    }

    public void setNewValue() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i * 10;
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
    }

}
