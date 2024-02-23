package lesson_28.test;

import lesson_28.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MemberTest {
    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmails(String email) {
        member.setEmail(email);
        Assertions.assertEquals(startEmail, member.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
          "test@ema@il.net",
                "test@emailnet",
                "test@.email.net",
                "test@emailne.t",
                "test@ema%il.net",
                "test@ema il.net",
                "test@email.net.",
                "@test.email.net"
        );
    }
    /*
    Требования к валидности паролю
    1. длина пароля больше 8 символов >= 8
    2. мин. 1 маленькая буква
    3. мин. 1 большая буква
    4. мин. 1 цифра
    5. мин. 1 спец символ ("!%$@*&()[])
     */
    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testSetInvalidPassword(String password) {
        member.setPassword(password);
        Assertions.assertEquals(startPassword, member.getPassword());
    }

    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "qwerty1Qa",
                "qwerty%###",
                "qwerty1q$",
                "qwertywwwwQ$",
                "QWERTY1Q$",
                "qwerty1Q$"
        );
    }

    @Test
    public void testPasswordIsNotNull() {
        Assertions.assertNotNull(member.getPassword());
    }

}