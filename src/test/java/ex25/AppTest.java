package ex25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("All of the tests")
    void passwordValidator() {
        App app = new App();
        assertEquals(0, app.passwordValidator("123345"));
        assertEquals(1, app.passwordValidator("abdsfhf"));
        assertEquals(2, app.passwordValidator("asd123"));
        assertEquals(3, app.passwordValidator("12asdf!&"));

    }
}