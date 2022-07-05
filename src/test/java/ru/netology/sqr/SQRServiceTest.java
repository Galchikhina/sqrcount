package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcNumber() {
        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();

        int expected = 3;
        int actual = service.calcNumberSqr(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
