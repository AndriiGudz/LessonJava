package lesson_18;

public class MathUtils {

    public static int sumOfInts(int x, int...ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

}
