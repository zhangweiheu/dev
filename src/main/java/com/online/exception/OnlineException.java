package com.online.exception;

public class OnlineException extends RuntimeException {
    public OnlineException() {
        this("出现异常");
    }

    public OnlineException(String message) {
        super(message);
    }
}
