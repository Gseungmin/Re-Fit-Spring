package com.umc.refit.exception.myInfo;

import com.umc.refit.exception.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MyInfoException extends RuntimeException {
    private ExceptionType exceptionType;
    private int code;
    private String errorMessage;
}
