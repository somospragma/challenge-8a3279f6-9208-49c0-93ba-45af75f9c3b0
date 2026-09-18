package com.pragma.investment.domain.exception;

public class InvestmentServiceException extends RuntimeException {
    public InvestmentServiceException(String message) {
        super(message);
    }
}