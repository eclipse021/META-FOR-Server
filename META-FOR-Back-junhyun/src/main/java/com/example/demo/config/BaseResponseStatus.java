package com.example.demo.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BaseResponseStatus {

    //요청 성공
    Success(true, 200, "ok"),

    //exception Handler
    UNEXPECTED_ERROR(false, 1000, "예상치 못한 오류"),
    VALIDATION_ERROR(false, 1100, "validation 오류");

    private final boolean isSuccess;
    private final int code;
    private final String message;

}
