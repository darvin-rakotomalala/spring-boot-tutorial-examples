package com.poc.exception;

public enum ErrorsEnum {

    ERR_ID_USER("ERR_ID_USER", "Id User can not be null.", Boolean.TRUE),
    ;

    private final String errorCode;
    private final String errorMessage;
    private final Boolean error;

    ErrorsEnum(String errorCode, String errorMessage, Boolean error) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.error = error;
    }

    @Override
    public String toString() {
        return "ErrorCode : " + errorCode + " errorMessage : " + errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Boolean getError() {
        return error;
    }
}
