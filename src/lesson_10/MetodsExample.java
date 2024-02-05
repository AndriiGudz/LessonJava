package lesson_10;

public class MetodsExample {
    public static void main(String[] args) {

        sayHello();

        char ch = 'A';
        char ch1 = 'G';
        char ch2 = 't';

        // кусок кода который умеет выводить на экран код символа в десятичной системе счисления

        printDecimalCode('V');
        printDecimalCode(ch);

        printDecimalCode(ch1);

        int[] array = {1, 45, 76, 37, 90, 5432, 397, 0, 45};

        printArray(array);

        array[4] = 4565;


    } // Methods area


    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }
    }

    public static void printDecimalCode(char ch1) {
        System.out.println("Приняли в методе значение: " + ch1);
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println("Hello");
        System.out.println(z);
    }

}
