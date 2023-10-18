package org.example;


import org.example.utils.StringUtils;

import java.util.Arrays;

public class Utils {

    /**
     * This method use module utils
     * @param strings all numbers for verify
     * @return true if all number positive
     */
    public boolean isAllPositiveNumbers(String[] strings) {
        return Arrays.stream(strings).allMatch(s -> new StringUtils().isPositiveNumber(s));
    }
}
