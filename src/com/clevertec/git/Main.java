package com.clevertec.git;

import com.clevertec.git.dto.InputDto;
import com.clevertec.git.services.InputService;

import com.clevertec.git.services.MathOperationService;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.clevertec.git.constants.CommonConstants.END;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final MathOperationService mathOperationService = new MathOperationService();
        boolean isContinue = true;

        while (isContinue) {
            final InputDto inputDto = InputService.inputData(sc);
            final String operation = inputDto.getOperation();
            final BigDecimal firstDigit = inputDto.getFirstDigit();
            final BigDecimal secondDigit = inputDto.getSecondDigit();

            BigDecimal result = mathOperationService.process(firstNumber, secondNumber, operation);
            System.out.println("result: " + result);
            System.out.println("input END for finish");
            String continueCondition = sc.next().toUpperCase();

            if (END.equals(continueCondition)) {
                isContinue = false;
                System.out.println("end");
            }
        }

    }
}
