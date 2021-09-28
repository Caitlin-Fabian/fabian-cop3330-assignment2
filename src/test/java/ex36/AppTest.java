package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        App app = new App();
        int[] numbers = {100, 200, 1000, 300};
        assertEquals(400.0 , app.average(numbers));
    }

    @Test
    void minimum() {
        App app = new App();
        int[] numbers = {100, 200, 1000, 300};
        assertEquals(100,app.minimum(numbers));
    }

    @Test
    void maximum() {
        App app = new App();
        int[] numbers = {100, 200, 1000, 300};
        assertEquals(1000,app.maximum(numbers));

    }

    @Test
    void standardDev() {
        App app = new App();
        int[] numbers = {100, 200, 1000, 300};
        assertEquals(353.5533905932738,app.standardDev(numbers));
    }
}