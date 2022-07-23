package ru.netology.sqr.HowManySquares.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    int expected= 3;

    @ParameterizedTest
    @CsvSource({
            "8, 100, 300",
            "9, 500, 1000"
    })

    public void shouldCalcSQRService (int expected, int low, int high){
        SQRService service = new SQRService();
        int actual = service.calcSQRService(low, high);

        Assertions.assertEquals(expected, actual);
    }

}
