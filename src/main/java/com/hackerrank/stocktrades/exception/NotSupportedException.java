package com.hackerrank.stocktrades.exception;

public class NotSupportedException extends RuntimeException {
    public NotSupportedException() {
    }

    public NotSupportedException(String message) {
        super(message);
    }
}
