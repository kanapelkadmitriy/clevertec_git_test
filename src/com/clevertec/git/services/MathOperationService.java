package com.clevertec.git.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathOperationService {

    public static BigDecimal addition(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.add(secondDigit);
    }

    public static BigDecimal subtraction(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.subtract(secondDigit);
    }

    public static BigDecimal multiplication(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.multiply(secondDigit);
    }

    public static BigDecimal division(BigDecimal firstDigit, BigDecimal secondDigit) {
        return firstDigit.divide(secondDigit, 2, RoundingMode.HALF_UP);
    }
}
