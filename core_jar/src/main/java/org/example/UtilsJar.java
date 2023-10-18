package org.example;

import org.example.utils.StringUtils;

import java.util.Arrays;

public class UtilsJar {

    /**
     * This method use compiled jar utils
     * @param strings all numbers for verify for jar
     * @return true if all number positive
     */
    public boolean isAllPositiveNumbersFromJar(String[] strings) {
        return Arrays.stream(strings).allMatch(s -> new StringUtils().isPositiveNumber(s));
    }
}
