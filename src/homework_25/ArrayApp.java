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
        array.lastIndexOf(2);
        System.out.println(array.get(-5));

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
        System.out.println(arrayStr.remove("new"));
        System.out.println(arrayStr.toString());


        System.out.println("\n===== Работаем с массивом типа Number =====\n");
        MyList<Number> numberList = new RubberArray<>();
        numberList.addAll(23, 55.5, 100, -30, -12.22);
        System.out.println(numberList.toString());
        System.out.println("Количество элементов в массиве: " + numberList.size());
        System.out.println(numberList.lastIndexOf(-30));
        System.out.println(numberList.contains(-100));

        System.out.println(numberList.remove(0));
        System.out.println(numberList.toString());

        System.out.println(numberList.remove(Integer.valueOf(-30))); // Мы используем Integer.valueOf(), чтобы получить объект типа Integer, представляющий число -30. Необходимо только для числовых значений.

    }
}
