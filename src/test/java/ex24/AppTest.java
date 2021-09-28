package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("They are anagrams")
    void isAnagram() {
            App app = new App();
            String name1 = "tone";
            String name2 = "note";
            String name3 = "dog";
            boolean actual = app.isAnagram(name1,name2);
            assertEquals(true, actual);
            boolean actual1 =app.isAnagram(name3, name1);
            assertFalse(false, String.valueOf(actual1));
    }
}