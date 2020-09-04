package com.hackerrank.stocktrades.exception;

public class ServiceRequestException extends RuntimeException {
    public ServiceRequestException() {
    }

    public ServiceRequestException(String message) {
        super(message);
    }

    public ServiceRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceRequestException(Throwable cause) {
        super(cause);
    }

    public ServiceRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
