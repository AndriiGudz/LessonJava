package lesson_27.persons.test;

import lesson_28.EnumTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    // Метод помеченный этой анотацией выполняется перед каждым тестом (перед каждым методом, помеченным аннотацией @Test)
    @BeforeEach
    public void setUp() {

    }

    //    @BeforeAll - метод запускается один раз перед выполнением первого теста
    //    @AfterEach - выполняется после каждого тестового метода
    //    @AfterAll - выполняется один раз после всех тестовых методов
    //    @Disabled - указывает, что тест или группа тестов отключена и выполняться не будет
    //    @Nested - позволяет создавать вложенный тестовый класс. Может быть использован для группировки тестовых методов

    @Test // указывает, что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result); // тест будет пройден, если ожидаемый результат совпадет с фактическим
        Assertions.assertNotEquals(5, result); // тест будет пройден, если НЕ ожидаемый результат НЕ совпадет с фактическим
        assertTrue(4 == result); // проверяет, что условие верно
        assertFalse(5 == result); // проверяет, что условие ложно
        assertNull(null); // проверяет что объект равен null
        assertNotNull("String"); // проверяет что объект НЕ равен null
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "chery", "fig"})
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -3, 4, 5})
    public void testInts(int value){
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class) // В качестве источника набор констант из перечисления
    void testEnums(EnumTest value) {
        assertNotNull(value);
    }

    // В качестве источника данных может быть статический метод
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitsMethodSource(String argument) {
        System.out.println("Current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "fig", "orange");
    }

    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 2, false", "chery, 3, true"})
    public void testWithCsvSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    public void testWithFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEquak) {
        int result = input * input;
        Assertions.assertEquals(expected, result);
        assertEquals(isEquak, result == expected);
    }

    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @Disabled
    @Test
    public void testMethod() {
        System.out.println("Test metod");
    }

}