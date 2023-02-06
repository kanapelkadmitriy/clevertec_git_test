package com.clevertec.git;

import com.clevertec.git.dto.InputDto;
import com.clevertec.git.services.InputService;

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
            final InputDto inputDto = InputService.inputData(sc);
            final String operation = inputDto.getOperation();
            final BigDecimal firstDigit = inputDto.getFirstDigit();
            final BigDecimal secondDigit = inputDto.getSecondDigit();

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
                result = firstDigit.divide(secondDigit, 2, RoundingMode.HALF_UP);
            }
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
