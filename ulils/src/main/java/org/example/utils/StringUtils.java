package org.example.utils;

import java.math.BigDecimal;

public class StringUtils {

    /**
     * Throw NumberFormatException if incorrect number format
     * @param str - num for verify
     * @return true is num positive
     */
    public boolean isPositiveNumber(String str) {
        try {
            BigDecimal num = new BigDecimal(str);
            return num.compareTo(new BigDecimal(0)) >= 0;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Please enter num in correct format.");
        }

    }
}
