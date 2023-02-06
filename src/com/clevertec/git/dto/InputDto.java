package com.clevertec.git.dto;

import java.math.BigDecimal;

public class InputDto {
    private BigDecimal firstDigit;
    private String operation;
    private BigDecimal secondDigit;

    public InputDto(BigDecimal firstDigit, String operation, BigDecimal secondDigit) {
        this.firstDigit = firstDigit;
        this.operation = operation;
        this.secondDigit = secondDigit;
    }

    public BigDecimal getFirstDigit() {
        return firstDigit;
    }

    public void setFirstDigit(BigDecimal firstDigit) {
        this.firstDigit = firstDigit;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public BigDecimal getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(BigDecimal secondDigit) {
        this.secondDigit = secondDigit;
    }
}
