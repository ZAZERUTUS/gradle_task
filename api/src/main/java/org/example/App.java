package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Result from core: " + new Utils().isAllPositiveNumbers(new String[] {"12", "79"}));
        System.out.println("Result from core_jar: " + new UtilsJar().isAllPositiveNumbersFromJar(new String[] {"12", "79"}));
    }
}