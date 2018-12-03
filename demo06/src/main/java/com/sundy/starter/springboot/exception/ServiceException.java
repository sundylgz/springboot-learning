package com.sundy.starter.springboot.exception;

/**
 * 服务异常统一处理
 */
public class ServiceException extends RuntimeException {

    private int code;

    public ServiceException(String message, int code) {
        super(message);
        this.code = code;
    }

    public ServiceException(int code) {
        this.code = code;
    }

    public ServiceException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
