package com.example.demo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {
    private int status;
    private String message;

    public static ErrorResponse of(int status, String message) {
        ErrorResponse errorResponse = new ErrorResponse();

        errorResponse.status = status;
        errorResponse.message = message;

        return errorResponse;
    }
}
