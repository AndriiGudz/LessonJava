package lesson_25;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox box1 = new SimpleBox(10);
        System.out.println(box1);

        SimpleBox box2 = new SimpleBox(20);
        System.out.println(box2);

        int sum = (int) box1.getValue() + (int) box2.getValue();
        System.out.println("Сумма:  " + sum);

        // в коробочку можно положить все что угодно
        SimpleBox box3 = new SimpleBox("50");

        SimpleBox[] boxes = new SimpleBox[2];
        boxes[0] = box1;
        boxes[1] = box2;
        boxes[2] = box3;


        int sum1 = 0;

        for (int i = 0; i < boxes.length; i++) {
            sum1 += (int) boxes[i].getValue();
        }
        System.out.println("Сумма из массива:  " + sum1);


    }
}
