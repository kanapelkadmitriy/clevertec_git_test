package com.clevertec.git;

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
            System.out.println("input first digit: ");
            BigDecimal firstDigit = sc.nextBigDecimal();

            System.out.println("input second digit: ");
            BigDecimal secondDigit = sc.nextBigDecimal();

            System.out.println("input operation: ");
            String operation = sc.next();

            BigDecimal result = mathOperationService.process(firstDigit, secondDigit, operation);
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
