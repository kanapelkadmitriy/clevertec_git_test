package com.clevertec.git;

import com.clevertec.git.services.MathOperationService;

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
        final Scanner sc = new Scanner(System.in);
        final MathOperationService mathOperationService = new MathOperationService();
        boolean isContinue = true;

        while (isContinue) {
            System.out.println("input first digit: ");
            BigDecimal firstDigit = sc.nextBigDecimal();

            System.out.println("input second digit: ");
            BigDecimal secondDigit = sc.nextBigDecimal();

            System.out.println("input operation: ");
            String operation = sc.next();

            BigDecimal result = mathOperationService.process(firstDigit, secondDigit, operation);
            System.out.println("result: " + result);
            System.out.println("Do you want to continue(y/n): ");
            String continueCondition = sc.next();

            if (NO.equals(continueCondition)) {
                isContinue = false;
            }

            if (YES.equals(continueCondition)) {
                isContinue = true;
            }
        }

    }
}
