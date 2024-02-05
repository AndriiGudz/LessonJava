package homework_11;

public class Task0 {
    public static void main(String[] args) {
//        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
//        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//        Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса
//        распечатывается в обычном порядке, а начиная с этого индекса в обратном:
//        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
//        Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в
//        обратном порядке Если флаг == false -> печатает массив в прямом порядке

        int[] array = {1, 4, 3, 6, 7};
        sort(array);

        int index = 2;
        sort(array, index);

        boolean orderPrint = true;
        sort(array, orderPrint);


    }//end

    public static void sort(int[] sortArray) {
        System.out.print("[");
        for (int i = sortArray.length - 1; i >= 0; i--) {
            System.out.print(sortArray[i] + ((i > 0) ? ", " : "]\n"));
        }
    }

    public static void sort(int[] sortArray, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(sortArray[i] + ((i < index) ? ", " : ""));
        }
        for (int i = sortArray.length - 1; i >= index; i--) {
            System.out.print(sortArray[i] + ((i > 0) ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void sort(int[] sortArray, boolean orderPrint) {
        if (orderPrint == true) {
            System.out.print("[");
            for (int i = sortArray.length - 1; i >= 0; i--) {
                System.out.print(sortArray[i] + ((i > 0) ? ", " : "]\n"));
            }
        } else {
            System.out.print("[");
            for (int i = 0; i < sortArray.length; i++) {
                System.out.print(sortArray[i] + ((i < sortArray.length - 1) ? ", " : "]\n"));
            }
        }
    }

}
