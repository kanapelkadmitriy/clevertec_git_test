package com.clevertec.git.services;

import com.clevertec.git.dto.InputDto;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputService {

    public static InputDto inputData(Scanner sc) {
        System.out.println("input first digit: ");
        BigDecimal firstDigit = sc.nextBigDecimal();

        System.out.println("input operation: ");
        String operation = sc.next();

        System.out.println("input second digit: ");
        BigDecimal secondDigit = sc.nextBigDecimal();

        return new InputDto(firstDigit, operation, secondDigit);
    }


}
