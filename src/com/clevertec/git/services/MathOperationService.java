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
    public BigDecimal process(BigDecimal firstNumber, BigDecimal secondNumber, String operation) {
        BigDecimal result = null;

        if (ADDITION.equals(operation)) {
            result = addition(firstNumber, secondNumber);
        }
        if (SUBTRACTION.equals(operation)) {
            result = subtraction(firstNumber, secondNumber);
        }
        if (MULTIPLICATION.equals(operation)) {
            result = multiplication(firstNumber, secondNumber);
        }
        if (DIVISION.equals(operation)) {
            result = division(firstNumber, secondNumber);
        }
        if (EXPONENTIATION.equals(operation)) {
            result = exponentiation(firstNumber, secondNumber);
        }
        if (PERCENT.equals(operation)) {
            result = percent(firstNumber, secondNumber);
        }
        return result;
    }

    private BigDecimal addition(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.add(secondNumber);
    }

    private BigDecimal subtraction(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }

    private BigDecimal multiplication(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    private BigDecimal division(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.divide(secondNumber, 2, RoundingMode.HALF_UP);
    }

    private BigDecimal exponentiation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.pow(secondNumber.intValue());
    }

    private BigDecimal percent(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber
                .multiply(secondNumber)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
    }
}
