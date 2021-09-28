package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator app = new PaymentCalculator();
        assertEquals(70, app.calculateMonthsUntilPaidOff(500,12,100));
    }
}