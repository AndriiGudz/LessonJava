package lesson_27.persons.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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

}