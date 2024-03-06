package homework_36.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyComparator2Test {
    @Test
    public void testCompare_EvenNumbersInAscendingOrder() {
        MyComparator2 comparator = new MyComparator2();
        int result = comparator.compare(2, 4);
        assertEquals(-1, result); // Ожидаем, что 2 меньше 4
    }

    @Test
    public void testCompare_OddNumbersInDescendingOrder() {
        MyComparator2 comparator = new MyComparator2();
        int result = comparator.compare(9, 7);
        assertEquals(-1, result); // Ожидаем, что 9 больше 7
    }

    @Test
    public void testCompare_EvenAndOddNumbers() {
        MyComparator2 comparator = new MyComparator2();
        int result = comparator.compare(6, 9);
        assertEquals(-1, result); // Ожидаем, что 6 меньше 9
    }

    @Test
    public void testCompare_OddAndEvenNumbers() {
        MyComparator2 comparator = new MyComparator2();
        int result = comparator.compare(5, 8);
        assertEquals(1, result); // Ожидаем, что 5 больше 8
    }

    @Test
    public void testCompare_SameNumbers() {
        MyComparator2 comparator = new MyComparator2();
        int result = comparator.compare(3, 3);
        assertEquals(0, result); // Ожидаем, что 3 равно 3
    }
}
