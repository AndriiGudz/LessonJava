package homework_25;

public class ArrayApp {
    public static <T> void main(String[] args) {

        System.out.println("\n===== Работаем с массивом типа Integer =====\n");
        RubberArray<Integer> array = new RubberArray<>();
        array.add(888);
        array.add(-111);
        array.add(22);
        System.out.println(array.toString());
        array.addAll(10, 15, 19, 22);
        System.out.println(array.toString());
        System.out.println("Количество элементов в массиве: " + array.size());
        array.indexOf(15);

        System.out.println("\n===== Работаем с массивом типа String =====\n");
        RubberArray<String> arrayStr = new RubberArray<>();
        arrayStr.add("Java");
        arrayStr.add("Hello");
        arrayStr.add("world");
        System.out.println(arrayStr.toString());
        arrayStr.addAll("new", "add", "all");
        System.out.println(arrayStr.toString());
        System.out.println("Количество элементов в массиве: " + arrayStr.size());
        arrayStr.indexOf("Hllo");


    }
}
