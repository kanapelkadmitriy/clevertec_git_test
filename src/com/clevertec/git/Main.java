package com.clevertec.git;

import com.clevertec.git.dto.InputDto;
import com.clevertec.git.services.InputService;

import com.clevertec.git.services.MathOperationService;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.clevertec.git.constants.CommonConstants.END;

public class Main {
    public static void main(String[] args) {
        final MathOperationService mathOperationService = new MathOperationService();
        boolean isContinue = true;

        while (isContinue) {
            InputDto inputDto = null;
            try {
                inputDto = InputService.inputData();
            } catch (Exception ex) {
                System.out.println("invalid value, try once more");
                continue;
            }
            final String operation = inputDto.getOperation();
            final BigDecimal firstNumber = inputDto.getFirstDigit();
            final BigDecimal secondNumber = inputDto.getSecondDigit();

            BigDecimal result = mathOperationService.process(firstNumber, secondNumber, operation);
            System.out.println("result: " + result);
            String continueCondition = InputService.inputCondition();

            if (END.equals(continueCondition)) {
                isContinue = false;
                System.out.println("end");
            }
        }

    }
}
