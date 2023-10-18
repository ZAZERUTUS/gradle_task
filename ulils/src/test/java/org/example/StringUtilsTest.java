package org.example;

import org.example.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {

    static StringUtils utils;

    @BeforeAll
    public static void init() {
        utils = new StringUtils();
    }

    @ParameterizedTest(name = "{index} -  Num {0} is positive {1}")
    @CsvSource(value = {
            "25, true",
            "0, true",
            "-201, false",
            "-1, false"
    })
    public void testIsPositiveNum(String str, boolean isPositive) {
        Assertions.assertEquals(utils.isPositiveNumber(str), isPositive);
    }

    @Test
    public void testIncorrectFormatNum() {
        Exception exception = assertThrows(NumberFormatException.class, () -> utils.isPositiveNumber("dee2"));

        String correctMes = "Please enter num in correct format.";
        Assertions.assertEquals(exception.getMessage(), correctMes);
    }
}
