package com.clevertec.git;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static com.clevertec.git.constants.CommonConstants.NO;
import static com.clevertec.git.constants.CommonConstants.YES;
import static com.clevertec.git.constants.MathSymbolsConstants.ADDITION;
import static com.clevertec.git.constants.MathSymbolsConstants.DIVISION;
import static com.clevertec.git.constants.MathSymbolsConstants.MULTIPLICATION;
import static com.clevertec.git.constants.MathSymbolsConstants.SUBTRACTION;

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
            if (ADDITION.equals(operation)) {
                result = firstDigit.add(secondDigit);
            }
            if (SUBTRACTION.equals(operation)) {
                result = firstDigit.subtract(secondDigit);
            }
            if (MULTIPLICATION.equals(operation)) {
                result = firstDigit.multiply(secondDigit);
            }
            if (DIVISION.equals(operation)) {
                try {
                    result = firstDigit.divide(secondDigit, 2, RoundingMode.HALF_UP);
                } catch (ArithmeticException ex) {
                    System.out.println("division by zero incorrect, try once more");
                    continue;
                }
            }
            System.out.println("result: " + result);
            System.out.println("do you want to continue(y/n): ");
            String continueCondition = sc.next();

            if (NO.equals(continueCondition)) {
                isContinue = false;
                System.out.println("end");
            }

            if (YES.equals(continueCondition)) {
                isContinue = true;
            }
        }

    }
}
