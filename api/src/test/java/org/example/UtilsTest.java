package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilsTest {
    static Utils utils;

    @BeforeAll
    public static void init() {
        utils = new Utils();
    }

    @ParameterizedTest(name = "{index} -  Num {0} is positive {1}")
    @CsvSource(value = {
            "25 2 5, true",
            "0, true",
            "-201 1000 11111, false",
            "-1 -1256, false"
    })
    public void testIsPositiveNum(String str, boolean isPositive) {
        Assertions.assertEquals(utils.isAllPositiveNumbers(str.split(" ")), isPositive);
    }

    @Test
    public void testIncorrectFormatNum() {
        Exception exception = assertThrows(NumberFormatException.class, () -> utils.isAllPositiveNumbers(new String[]{"dee2"}));

        String correctMes = "Please enter num in correct format.";
        Assertions.assertEquals(exception.getMessage(), correctMes);
    }
}
