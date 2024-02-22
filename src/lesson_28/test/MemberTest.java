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


}