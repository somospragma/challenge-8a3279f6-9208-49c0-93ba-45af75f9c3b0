package com.pragma.investment.domain.exception;

public class InvalidInvestmentDataException extends RuntimeException {
    public InvalidInvestmentDataException(String message) {
        super(message);
    }
}