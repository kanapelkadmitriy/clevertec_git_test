package com.clevertec.git.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.clevertec.git.constants.MathSymbolsConstants.ADDITION;
import static com.clevertec.git.constants.MathSymbolsConstants.DIVISION;
import static com.clevertec.git.constants.MathSymbolsConstants.EXPONENTIATION;
import static com.clevertec.git.constants.MathSymbolsConstants.MULTIPLICATION;
import static com.clevertec.git.constants.MathSymbolsConstants.PERCENT;
import static com.clevertec.git.constants.MathSymbolsConstants.SUBTRACTION;

public class MathOperationService {
    public BigDecimal process(BigDecimal firstDigit, BigDecimal secondDigit, String operation) {
        BigDecimal result = null;

        if (ADDITION.equals(operation)) {
            result = addition(firstDigit, secondDigit);
        }
        if (SUBTRACTION.equals(operation)) {
            result = subtraction(firstDigit, secondDigit);
        }
        if (MULTIPLICATION.equals(operation)) {
            result = multiplication(firstDigit, secondDigit);
        }
        if (DIVISION.equals(operation)) {
            result = division(firstDigit, secondDigit);
        }
        if (EXPONENTIATION.equals(operation)) {
            result = exponentiation(firstDigit, secondDigit);
        }
        if (PERCENT.equals(operation)) {
            result = percent(firstDigit, secondDigit);
        }
        return result;
    }

    private BigDecimal addition(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.add(secondDigit);
    }

    private BigDecimal subtraction(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.subtract(secondDigit);
    }

    private BigDecimal multiplication(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.multiply(secondDigit);
    }

    private BigDecimal division(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.divide(secondDigit, 2, RoundingMode.HALF_UP);
    }

    private BigDecimal exponentiation(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.pow(secondDigit.intValue());
    }

    private BigDecimal percent(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit
                .multiply(BigDecimal.valueOf(100))
                .divide(secondDigit, 2, RoundingMode.HALF_UP);
    }
}
