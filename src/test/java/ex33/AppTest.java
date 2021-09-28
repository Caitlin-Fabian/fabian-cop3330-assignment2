package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void answer() {
        App app = new App();
        assertEquals("Yes", app.answer(0));
        assertEquals("No", app.answer(1));
        assertEquals("Ask again later", app.answer(2));

    }
}