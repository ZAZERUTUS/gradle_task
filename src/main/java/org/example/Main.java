package org.example;

import org.example.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!" + new StringUtils().isPositiveNumber("123"));
        System.out.println("Hello world 1!" + new Utils().isAllPositiveNumbers(new String[] {"1", "331"}));
        System.out.println("Hello world 2!" + new Utils().isAllPositiveNumbers(new String[] {"1", "331"}));
    }
}