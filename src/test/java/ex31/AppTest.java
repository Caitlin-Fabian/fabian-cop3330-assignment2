package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void heartRateCalc() {
        App app = new App();
        assertEquals(138, app.heartRateCalc(65,22,55));
        assertEquals(144, app.heartRateCalc(65,22,60));
        assertEquals(151, app.heartRateCalc(65,22,65));
        assertEquals(158, app.heartRateCalc(65,22,70));
        assertEquals(164, app.heartRateCalc(65,22,75));
        assertEquals(171, app.heartRateCalc(65,22,80));
        assertEquals(178, app.heartRateCalc(65,22,85));
        assertEquals(184, app.heartRateCalc(65,22,90));
        assertEquals(191, app.heartRateCalc(65,22,95));
    }
}