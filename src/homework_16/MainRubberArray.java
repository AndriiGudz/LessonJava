package homework_16;


public class MainRubberArray {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        System.out.println(ra.toString());

        ra.add(15);
        ra.add(-10);
        ra.add(100);

        for (int i = 1; i < 11; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }

        ra.add(100, 15, 17, -5, 24, 55, 15);
        ra.add(0);
        ra.add(888);

        System.out.println(ra.toString());

        System.out.println("\nПроверка домашнего задания\n");
//        ra.foundIndex(-10);
        ra.foundTargetInIndex(6);
        ra.foundLength();

        ra.replaceTargetToIndex(333, 4);
        System.out.println("\nЗамена значения по индексу\n" + ra);

        ra.replaceTargetToTarget(15, 222);
        System.out.println("\nЗамена старого значения на новое\n" + ra);


    }
}
