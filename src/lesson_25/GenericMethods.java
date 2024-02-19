package lesson_25;

public class GenericMethods {
    // можно создать только отдельный параметризованный метод, а не целый клас.
    public static <T> void printBoxes(GenericsBox<T>[] boxes) {
        for (GenericsBox<T> box : boxes) {
            System.out.println(box + "; ");
        }

    }


}
