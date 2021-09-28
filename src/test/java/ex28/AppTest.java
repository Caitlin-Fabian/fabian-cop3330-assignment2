package ex28;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void adding() {
        App app = new App();
        assertEquals(15, app.adding(1,2,3,4,5));
    }
}