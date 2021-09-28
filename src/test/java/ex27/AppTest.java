package ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Zip code")
    void validateZip() {
        App app = new App();
        int zip = 12345;
        int zip2 = 123;
        assertEquals(true, app.validateZip(zip));
        assertEquals(false, app.validateZip(zip2));

    }

    @Test
    @DisplayName("Empolyee ID")
    void validateID() {
        App app = new App();
        assertEquals(true, app.validateID("AA-1234"));
        assertEquals(false, app.validateID("AAAAAAA"));
    }

    @Test
    @DisplayName("First and last name")
    void validateName() {
        App app = new App();
        assertEquals(true, app.validateName("Caitlin"), "This did not accept the first name");
        assertEquals(true, app.validateName("Fabian"), "This did not accept the last name");
    }
}