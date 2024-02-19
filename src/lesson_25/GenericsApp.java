package lesson_25;

import lesson_22.Cat;

public class GenericsApp {
    public static void main(String[] args) {

        GenericsBox<String> boxStr = new GenericsBox<>("Hello");
        System.out.println(boxStr);

        String strValue = boxStr.getValue();
        // boxStr.setValue(150); - ошибка компиляции. Проверка на несовпадение типов.

        GenericsBox<Cat> catBoxes = new GenericsBox<>(new Cat());

        System.out.println(catBoxes);
        // catBoxes.setValue("Cat"); - тоже ошибка компиляции. String не является типом Cat

        // Generics не работают с примитивными типами данных
        // Работает только с ссылочными типами данных.
        // GenericsBox<int> genericsBox = new GenericsBox<int>(100);

        GenericsBox<Integer> integerBox = new GenericsBox<>(100);

        GenericsBox<Integer>[] boxes = new GenericsBox[3];
        boxes[0] =  new GenericsBox<>(150);
        boxes[1] =  new GenericsBox<>(170);
        boxes[2] =  new GenericsBox<>(-150);

        int sum = 0;
        for (GenericsBox<Integer> val : boxes) {
            sum += val.getValue();
        }
        System.out.println(sum);

        GenericMethods.printBoxes(boxes);


    }
}
