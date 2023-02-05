package com.clevertec.git;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("input first digit: ");
            BigDecimal firstDigit = sc.nextBigDecimal();

            System.out.println("input second digit: ");
            BigDecimal secondDigit = sc.nextBigDecimal();

            System.out.println("input operation: ");
            String operation = sc.next();

            BigDecimal result = null;
            if ("+".equals(operation)) {
                result = firstDigit.add(secondDigit);
            }
            if ("-".equals(operation)) {
                result = firstDigit.subtract(secondDigit);
            }
            if ("*".equals(operation)) {
                result = firstDigit.multiply(secondDigit);
            }
            if ("/".equals(operation)) {
                result = firstDigit.divide(secondDigit, 2, RoundingMode.HALF_UP);
            }
            System.out.println("result: " + result);
            System.out.println("Do you want to continue(y/n): ");
            String continueCondition = sc.next();

            if ("n".equals(continueCondition.toLowerCase())) {
                isContinue = false;
            }
        }

    }
}
